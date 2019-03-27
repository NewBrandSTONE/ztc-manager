package com.ztc.manager.service;

import com.ztc.manager.module.SysUser;

public interface SysUserService {

    SysUser findByUserName(String userName);

}
