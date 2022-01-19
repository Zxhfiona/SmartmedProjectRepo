package com.zxhfiona.smartmed.system.admin.pojo.vo;


import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <b>智慧医疗信息平台 - 系统功能 - 系统用户角色 Vue 操作路由视图信息</b>
 *
 * @author Fiona
 * @date 2022/1/19
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class RouterVO implements Serializable {
	private static final long serialVersionUID = -3341248730662149949L;
	private String name;                    // 菜单文本
	private String path;                    // 链接地址
	private String component;               // 菜单组件
	private Meta meta;                      // 路由页面显示图标
	private List<RouterVO> children;        // 下级菜单（路由集合）

	/**
	 * <b>智慧医疗信息平台 - 系统功能 - 系统用户角色 Vue 操作路由 Meta 视图信息</b>
	 *
	 * @author Fiona
	 * @date 2022/1/19
	 * @version 1.0.0
	 * @since 1.0.0
	 */
	@Data
	public static class Meta implements Serializable {
		private static final long serialVersionUID = -8621521784742701005L;
		private String title;                       // 网页名称
		private String icon;                        // 网页图标
	}
}

