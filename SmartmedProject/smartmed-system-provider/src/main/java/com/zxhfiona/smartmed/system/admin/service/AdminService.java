package com.zxhfiona.smartmed.system.admin.service;

import com.zxhfiona.smartmed.system.admin.pojo.vo.AdminVO;

/**
 * <b>系统功能 - 系统用户业务层接口</b>
 *
 * @author Fiona
 * @date 2022/1/6
 * @version 1.0.0
 * @since 1.0.0
 */
public interface AdminService {
	/**
	 * <b>根据手机号码查询系统用户视图信息</b>
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	AdminVO getAdminVOByCellphone(String cellphone) throws Exception;
}
