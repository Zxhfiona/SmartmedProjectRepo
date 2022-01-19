package com.zxhfiona.smartmed.system.admin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zxhfiona.smartmed.system.admin.pojo.entity.Admin;
import org.springframework.stereotype.Repository;

/**
 * <b>智慧医疗信息平台 - 系统管理功能 - 系统用户数据持久层接口</b>
 *
 * @author Fiona
 * @date 2022/1/17
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository("adminDao")
public interface AdminDao extends BaseMapper<Admin> {
}
