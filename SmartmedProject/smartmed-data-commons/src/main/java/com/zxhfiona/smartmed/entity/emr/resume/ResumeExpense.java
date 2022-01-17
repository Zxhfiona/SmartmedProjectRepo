package com.zxhfiona.smartmed.entity.emr.resume;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zxhfiona.smartmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>病历概要数据医疗费用信息表</b>
 *
 * @author Fiona
 * @date 2022/1/12
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("emr_resume_expense")
public class ResumeExpense extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId(type = IdType.NONE)
	private String id;                        // 主键
	@TableField(value = "emrResume")
	private String emrResume;                        // 所属病历概要数据
	@TableField(value = "expClinicCat")
	private String expClinicCat;                        // 门诊费用-分类
	@TableField(value = "expClinicCatCode")
	private String expClinicCatCode;                        // 门诊费用-分类代码
	@TableField(value = "clinicAmount")
	private Double clinicAmount;                        // 门诊费用-金额（元/人民币）
	@TableField(value = "clinicPayTypeCode")
	private String clinicPayTypeCode;                        // 门诊费用-支付方式代码
	@TableField(value = "hospExpCat")
	private String hospExpCat;                        // 住院费用-分类
	@TableField(value = "hospExpCatCode")
	private String hospExpCatCode;                        // 住院费用-分类代码
	@TableField(value = "hospAmount")
	private Double hospAmount;                        // 住院费用-金额（元/人民币）
	@TableField(value = "personAmount")
	private Double personAmount;                        // 个人承担费用（元）
}