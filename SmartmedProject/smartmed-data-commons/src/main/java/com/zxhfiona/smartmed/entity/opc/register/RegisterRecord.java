package com.zxhfiona.smartmed.entity.opc.register;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zxhfiona.smartmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>病人就诊信息表</b>
 *
 * @author Fiona
 * @date 2022/1/12
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("opc_register_record")
public class RegisterRecord extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId(type = IdType.NONE)
	private String id;                        // 主键
	@TableField(value = "patient")
	private String patient;                        // 病人信息
	@TableField(value = "emrNo")
	private String emrNo;                        // 病历号
	@TableField(value = "clinicNo")
	private String clinicNo;                        // 门诊号
	@TableField(value = "department")
	private String department;                        // 科室信息
	@TableField(value = "doctor")
	private String doctor;                        // 医生信息
}