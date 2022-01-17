package com.zxhfiona.smartmed.entity.emr.clinicobs;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zxhfiona.smartmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>急诊留观病历既往史信息表</b>
 *
 * @author Fiona
 * @date 2022/1/12
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("emr_clinic_obs_past")
public class ClinicObsPast extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId(type = IdType.NONE)
	private String id;                        // 主键
	@TableField(value = "emrClinicObs")
	private String emrClinicObs;                        // 所属急诊留观病历
	@TableField(value = "itemName")
	private String itemName;                        // 既往观察-项目名称
	@TableField(value = "itemCatCode")
	private String itemCatCode;                        // 既往观察-项目分类代码
	@TableField(value = "itemCodeName")
	private String itemCodeName;                        // 既往观察-项目代码名称
	@TableField(value = "itemCode")
	private String itemCode;                        // 既往观察-项目代码
	@TableField(value = "methodCode")
	private String methodCode;                        // 既往观察-方法代码
	@TableField(value = "result")
	private String result;                        // 既往观察-结果
	@TableField(value = "pastTypeName")
	private String pastTypeName;                        // 既往史观察项目类目名称
	@TableField(value = "pastResult")
	private String pastResult;                        // 既往史观察结果
}