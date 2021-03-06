package com.zxhfiona.smartmed.system.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zxhfiona.smartmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 系统功能模块 - 系统菜单（路由）实体信息</b>
 *
 * @author Fiona
 * @date 2022/1/17
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("sys_menu")
public class Menu extends BaseEntity {
	private static final long serialVersionUID = 1505218417228357012L;
	@TableId(type = IdType.AUTO)
	private Long id;                        // 主键
	@TableField(value = "上级菜单")
	private String parent;                  // 上级菜单
	@TableField(value = "菜单文本")
	private String name;                    // 菜单文本
	@TableField(value = "角色编码")
	private String code;                    // 角色编码
	@TableField(value = "链接地址")
	private String path;                    // 链接地址
	@TableField(value = "菜单组件")
	private String component;               // 菜单组件
	@TableField(value = "菜单标题")
	private String title;                   // 菜单标题
	@TableField(value = "菜单图标")
	private String icon;                    // 菜单图标
	@TableField(value = "排序")
	private String sort;                    // 排序
}
