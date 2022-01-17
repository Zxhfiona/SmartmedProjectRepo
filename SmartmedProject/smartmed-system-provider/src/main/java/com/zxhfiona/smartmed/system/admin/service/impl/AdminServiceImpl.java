package com.zxhfiona.smartmed.system.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zxhfiona.smartmed.entity.system.admin.Admin;
import com.zxhfiona.smartmed.system.admin.dao.AdminDao;
import com.zxhfiona.smartmed.system.admin.pojo.vo.AdminVO;
import com.zxhfiona.smartmed.system.admin.service.AdminService;
import com.zxhfiona.smartmed.util.PojoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <b>系统功能 - 系统用户业务层接口实现类</b>
 *
 * @author Fiona
 * @date 2022/1/6
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;

	/**
	 * <b>根据手机号码查询对象信息</b>
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	@Override
	public AdminVO getAdminVOByCellphone(String cellphone) throws Exception {
		// 创建 MyBatis Plus 查询对象 QueryWrapper
		QueryWrapper<Admin> queryWrapper = new QueryWrapper<Admin>();
		queryWrapper.eq("cellphone", cellphone);
		// 进行查询
		Admin admin = adminDao.selectOne(queryWrapper);
		// 判断是否能够获得结果
		if (admin != null) {
			// 将实体对象转换为视图对象，进行返回
			AdminVO adminVO = PojoMapper.INSTANCE.parseToVO(admin);
			return adminVO;
		}
		return null;
	}
}
