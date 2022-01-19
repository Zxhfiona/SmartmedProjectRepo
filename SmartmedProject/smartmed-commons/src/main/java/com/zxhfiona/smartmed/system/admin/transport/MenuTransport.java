package com.zxhfiona.smartmed.system.admin.transport;

import com.zxhfiona.smartmed.system.admin.pojo.vo.RoleVO;
import com.zxhfiona.smartmed.system.admin.pojo.vo.RouterVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * <b>智慧医疗信息平台 - 系统管理功能 - 系统菜单传输层接口</b>
 *
 * @author Fiona
 * @date 2022/1/18
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient(name = "smartmed-system-provider")
public interface MenuTransport {
	/**
	 * <b>根据角色信息获得该角色对应的操作路由列表</b>
	 * @param roleVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/system/admin/menu/trans/routerlist")
	List<RouterVO> getRouterVOListByRoleVO(@RequestBody RoleVO roleVO) throws Exception;
}
