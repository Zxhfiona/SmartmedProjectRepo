package com.zxhfiona.smartmed.entity.emr.clinicrx;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zxhfiona.smartmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>门（急）诊西医处方通信信息表</b>
 *
 * @author Fiona
 * @date 2022/1/12
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
@TableName("emr_clinic_wm_rx_comm")
public class ClinicWmRxComm extends BaseEntity {
	private static final long serialVersionUID = 1L;
	@TableId(type = IdType.NONE)
	private String id;                        // 主键
	@TableField(value = "emrClinicRx")
	private String emrClinicRx;                        // 门（急）诊西医处方
	@TableField(value = "phoneCat")
	private String phoneCat;                        // 联系电话-类别
	@TableField(value = "phoneCatCode")
	private String phoneCatCode;                        // 联系电话-类别代码
	@TableField(value = "phoneNo")
	private String phoneNo;                        // 联系电话-号码
	@TableField(value = "email")
	private String email;                        // 电子邮件地址
}