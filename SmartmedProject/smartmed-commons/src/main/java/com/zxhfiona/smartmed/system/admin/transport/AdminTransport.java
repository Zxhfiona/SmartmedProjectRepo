package com.zxhfiona.smartmed.system.admin.transport;

import com.zxhfiona.smartmed.system.admin.pojo.vo.AdminVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <b>智慧医疗信息平台 - 系统管理功能 - 系统用户传输层接口</b>
 *
 * @author Fiona
 * @date 2022/1/6
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient(name = "smartmed-system-provider")
public interface AdminTransport {
	/**
	 * <b>根据手机号码查询系统用户视图信息</b>
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/system/admin/admin/trans/login")
	AdminVO getAdminVOByCellphone(@RequestParam String cellphone) throws Exception;
}
