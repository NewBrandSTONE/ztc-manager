package com.ztc.www.service.impl;

import com.ztc.manager.module.SysUser;
import com.ztc.manager.service.SysUserService;
import com.ztc.www.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findByUserName(String userName) {

        return sysUserMapper.findUserByName(userName);
    }

}
