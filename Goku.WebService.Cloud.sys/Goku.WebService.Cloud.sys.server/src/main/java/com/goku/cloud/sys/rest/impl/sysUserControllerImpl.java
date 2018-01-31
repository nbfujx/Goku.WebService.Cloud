package com.goku.cloud.sys.rest.impl;

import com.goku.cloud.model.sysUser;
import com.goku.cloud.sys.rest.sysUserController;
import com.goku.cloud.sys.service.sysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nbfujx on 2018/1/31.
 */
@RestController
public class sysUserControllerImpl implements sysUserController {

    @Autowired
    sysUserService sysuserservice;

    @Override
    @RequestMapping("/getUser")
    public sysUser getUserByid(@RequestParam String id) {
        return sysuserservice.selectByid(id);
    }
}
