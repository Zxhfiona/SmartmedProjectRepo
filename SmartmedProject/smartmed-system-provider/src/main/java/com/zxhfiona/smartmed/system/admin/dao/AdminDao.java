package com.zxhfiona.smartmed.system.admin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zxhfiona.smartmed.entity.system.admin.Admin;
import org.springframework.stereotype.Repository;

/**
 * <b>系统功能 - 系统用户数据持久层接口</b>
 *
 * @author Fiona
 * @date 2022/1/6
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface AdminDao extends BaseMapper<Admin> {
}
