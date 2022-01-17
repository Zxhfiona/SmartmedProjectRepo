package com.zxhfiona.smartmed.system.admin;

import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.digest.MD5;
import com.zxhfiona.smartmed.base.controller.BaseController;
import com.zxhfiona.smartmed.base.pojo.enums.StatusEnum;
import com.zxhfiona.smartmed.base.pojo.vo.ResponseVO;
import com.zxhfiona.smartmed.base.util.BaseConstants;
import com.zxhfiona.smartmed.base.util.RedisUtil;
import com.zxhfiona.smartmed.base.util.TokenUtil;
import com.zxhfiona.smartmed.system.admin.pojo.vo.AdminLoginVO;
import com.zxhfiona.smartmed.system.admin.pojo.vo.AdminVO;
import com.zxhfiona.smartmed.system.admin.transport.AdminTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>系统功能 - 系统用户控制层类</b>
 *
 * @author Fiona
 * @date 2022/1/6
 * @version 1.0.0
 * @since 1.0.0
 */
@CrossOrigin
@RestController("adminController")
@RequestMapping("/system/admin/admin")
public class AdminController extends BaseController {
	@Autowired
	private AdminTransport adminTransport;
	@Autowired
	private RedisUtil redisUtil;

	/**
	 * <b>用户使用登录视图进行用户登录操作</b>
	 * @param adminLoginVO
	 * @param result
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/login")
	public ResponseVO loginAdmin(@RequestBody @Validated AdminLoginVO adminLoginVO, BindingResult result)
			throws Exception {
		// 判断是否存在用户登录信息错误
		if (result.hasErrors()) {
			return ResponseVO.error("手机号码或登录密码错误");
		}
		// 根据手机号码查询用户信息
		AdminVO adminVO = adminTransport.getAdminVOByCellphone(adminLoginVO.getCellphone());
		// 判断能够查询到用户信息
		if (adminVO == null) {
			// 未能够查询到用户信息
			return ResponseVO.error("手机号码或登录密码错误");
		}
		// 判断该用户是否处于禁用状态
		if (StatusEnum.STATUS_DISABLE.getCode().equals(adminVO.getStatus())) {
			return ResponseVO.error("该用户禁止登录系统");
		}
		// 判断用户登录密码是否正确
		if (!adminVO.getPassword().equals(MD5.create().digestHex(adminLoginVO.getPassword()))) {
			// 登录密码错误
			return ResponseVO.error("手机号码或登录密码错误");
		}
		// 生成 Token 信息
		Map<String, Object> claimMap = new HashMap<String, Object>();
		claimMap.put("id", adminVO.getId());
		claimMap.put("no", adminVO.getNo());
		String token = TokenUtil.createToken(claimMap, BaseConstants.EXPIRE_AUTH_SEC);
		if (StrUtil.isNotBlank(token)) {
			// 成功生成 Token，将该信息存储到 Redis 中
			if (redisUtil.saveToRedis(token, adminVO, BaseConstants.EXPIRE_AUTH_SEC)) {
				// 将 token 和当前登录用户信息扩展到 AdminLoginVO 中
				adminLoginVO.setToken(token);
				adminLoginVO.setAdminVO(adminVO);
				return ResponseVO.success("登录成功", adminLoginVO);
			}
		}
		return ResponseVO.exception(new Exception("登录失败"));
	}
}
