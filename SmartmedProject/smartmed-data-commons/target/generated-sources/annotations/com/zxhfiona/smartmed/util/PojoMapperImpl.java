package com.zxhfiona.smartmed.util;

import com.zxhfiona.smartmed.entity.system.admin.Admin;
import com.zxhfiona.smartmed.system.admin.pojo.vo.AdminVO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-16T15:57:14+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_301 (Oracle Corporation)"
)
@Component
public class PojoMapperImpl implements PojoMapper {

    @Override
    public AdminVO parseToVO(Admin entity) {
        if ( entity == null ) {
            return null;
        }

        AdminVO adminVO = new AdminVO();

        adminVO.setStatus( entity.getStatus() );
        adminVO.setCreatedBy( entity.getCreatedBy() );
        adminVO.setCreatedTime( entity.getCreatedTime() );
        adminVO.setModifiedBy( entity.getModifiedBy() );
        adminVO.setModifiedTime( entity.getModifiedTime() );
        adminVO.setId( entity.getId() );
        adminVO.setNo( entity.getNo() );
        adminVO.setName( entity.getName() );
        adminVO.setCellphone( entity.getCellphone() );
        adminVO.setPassword( entity.getPassword() );
        adminVO.setRole( entity.getRole() );
        adminVO.setIdentity( entity.getIdentity() );
        adminVO.setDepartment( entity.getDepartment() );
        adminVO.setEducation( entity.getEducation() );

        return adminVO;
    }
}
