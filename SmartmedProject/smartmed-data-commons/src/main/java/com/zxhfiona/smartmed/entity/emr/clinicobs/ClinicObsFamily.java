package com.zxhfiona.smartmed.entity.emr.clinicobs;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zxhfiona.smartmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>急诊留观病历家族史信息表</b>
 *
 * @author Fiona
 * @date 2022/1/12
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("emr_clinic_obs_family")
public class ClinicObsFamily extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId(type = IdType.NONE)
	private String id;                        // 主键
	@TableField(value = "emrClinicObs")
	private String emrClinicObs;                        // 所属急诊留观病历
	@TableField(value = "typeName")
	private String typeName;                        // 家族史观察项目类目名称
	@TableField(value = "result")
	private String result;                        // 家族史观察结果
}