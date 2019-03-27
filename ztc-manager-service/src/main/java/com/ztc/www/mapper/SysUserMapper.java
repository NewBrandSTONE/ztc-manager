package com.ztc.www.mapper;

import com.ztc.manager.module.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserMapper {

    SysUser findUserByName(String userName);

}
