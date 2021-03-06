package com.zxhfiona.smartmed.system.admin.transport.impl;

import com.zxhfiona.smartmed.system.admin.pojo.vo.RoleVO;
import com.zxhfiona.smartmed.system.admin.pojo.vo.RouterVO;
import com.zxhfiona.smartmed.system.admin.service.MenuService;
import com.zxhfiona.smartmed.system.admin.transport.MenuTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <b>智慧医疗信息平台 - 系统管理功能 - 系统菜单传输层接口实现类</b>
 *
 * @author Fiona
 * @date 2022/1/18
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("menuTransport")
@RequestMapping("/system/admin/menu/trans")
public class MenuTransportImpl implements MenuTransport {
	@Resource(name = "menuService")
	private MenuService menuService;

	/**
	 * <b>根据角色信息获得该角色对应的操作路由列表</b>
	 * @param roleVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/routerlist")
	@Override
	public List<RouterVO> getRouterVOListByRoleVO(@RequestBody RoleVO roleVO) throws Exception {
		return menuService.getRouterVOListByRoleVO(roleVO);
	}
}

