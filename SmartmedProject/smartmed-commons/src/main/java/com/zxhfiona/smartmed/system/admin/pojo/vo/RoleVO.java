package com.zxhfiona.smartmed.system.admin.pojo.vo;

import com.zxhfiona.smartmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 系统功能项目 - 系统角色视图信息</b>
 *
 * @author Fiona
 * @date 2022/1/18
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class RoleVO extends BaseVO {
	private static final long serialVersionUID = -4301490560039731147L;
	private Long id;                        // 主键
	private String code;                    // 角色编码
	private String name;                    // 角色名称
}
