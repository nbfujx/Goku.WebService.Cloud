package com.goku.cloud.sys.controller.impl;

import com.alibaba.fastjson.JSON;
import com.goku.cloud.model.sysUser;
import com.goku.cloud.sys.controller.sysUserController;
import com.goku.cloud.sys.remote.sysUserRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017/10/15.
 */
@RestController
@RequestMapping("sysUser")
public class sysUserControllerImpl implements sysUserController {

    @Autowired
    sysUserRemote sysuserremote;


    @Override
    @RequestMapping(value="getUser/{id}", method = RequestMethod.GET)
    public String  getUserByid(@PathVariable("id") String id) {
        sysUser u=sysuserremote.getUserByid(id);
        return   JSON.toJSONString (u);
    }
}
