package com.ztc.manager.module;

import lombok.Data;

import java.util.Date;

@Data
public class SysUser {

    private String id;
    private String sysUserName;
    private String sysPwd;
    private String sysName;
    private Date creatTime;

}
