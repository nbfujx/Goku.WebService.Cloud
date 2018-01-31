package com.goku.cloud.sys.remote.hystrix;

import com.goku.cloud.model.sysUser;
import com.goku.cloud.sys.remote.sysUserRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by nbfujx on 2018/1/31.
 */
@Component
public class sysUserRemoteHystrix implements sysUserRemote {

    @Override
    public sysUser getUserByid(@RequestParam(value = "id") String id) {
        sysUser u=new sysUser();
        u.setName("3333");
        return u;
    }
}
