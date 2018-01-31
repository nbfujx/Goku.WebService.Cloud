package com.goku.cloud.sys.service;



import com.goku.cloud.model.sysUser;

import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017/10/14.
 */
public interface sysUserService {
    sysUser selectByUsername(String username);
    sysUser selectByid(String id);
    List<sysUser> selectUserByOrgid(String orgid, Integer pageNo, Integer pageSize, String orderSort, String orderFiled);
}
