package com.zxhfiona.smartmed.entity.emr.resume;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zxhfiona.smartmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>病历概要数据医保信息表</b>
 *
 * @author Fiona
 * @date 2022/1/12
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("emr_resume_ins")
public class ResumeIns extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId(type = IdType.NONE)
	private String id;                        // 主键
	@TableField(value = "emrResume")
	private String emrResume;                        // 所属病历概要数据
	@TableField(value = "insCat")
	private String insCat;                        // 医疗保险-类别
	@TableField(value = "insCatCode")
	private String insCatCode;                        // 医疗保险-类别代码
}