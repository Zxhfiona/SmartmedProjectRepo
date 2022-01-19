package com.zxhfiona.smartmed.system.admin.service;

import com.zxhfiona.smartmed.system.admin.pojo.vo.RoleVO;
import com.zxhfiona.smartmed.system.admin.pojo.vo.RouterVO;

import java.util.List;

/**
 * <b>智慧医疗信息平台 - 系统管理功能 - 系统菜单业务层接口</b>
 *
 * @author Fiona
 * @date 2022/1/18
 * @version 1.0.0
 * @since 1.0.0
 */
public interface MenuService {
	/**
	 * <b>根据角色信息获得该角色对应的操作路由列表</b>
	 * @param roleVO
	 * @return
	 * @throws Exception
	 */
	List<RouterVO> getRouterVOListByRoleVO(RoleVO roleVO) throws Exception;
}
