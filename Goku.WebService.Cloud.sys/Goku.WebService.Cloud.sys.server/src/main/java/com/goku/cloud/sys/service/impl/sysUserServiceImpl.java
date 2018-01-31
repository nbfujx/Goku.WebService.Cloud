package com.goku.cloud.sys.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.goku.cloud.model.sysUser;
import com.goku.cloud.sys.mapper.ext.sysUserExtMapper;
import com.goku.cloud.sys.service.sysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * Created by nbfujx on 2017/10/14.
 */
@Service
public class sysUserServiceImpl implements sysUserService {

    @Autowired
    private sysUserExtMapper sysusermapper;

    @Override
    public sysUser selectByid(String id) {
        return sysusermapper.selectByPrimaryKey(id);
    }

    @Override
    public sysUser selectByUsername(String username) {
        return sysusermapper.selectByUsername(username);
    }

    @Override
    public List<sysUser> selectUserByOrgid(String orgid,Integer pageNo,Integer pageSize,String orderSort,String orderFiled) {
        PageHelper.startPage(pageNo, pageSize);
        List<sysUser> userall= sysusermapper.selectUserByOrgid(orgid,orderSort,orderFiled);
        PageInfo<sysUser> pageInfo =new PageInfo(userall);
        List<sysUser> users=pageInfo.getList();
        return users;
    }


}
