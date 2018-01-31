package com.goku.cloud.sys.remote;

import com.goku.cloud.model.sysUser;
import com.goku.cloud.sys.remote.hystrix.sysUserRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by nbfujx on 2018/1/31.
 */
@FeignClient(name= "Goku.WebService.Cloud.sys.server", fallback = sysUserRemoteHystrix.class)
public interface sysUserRemote {

    @RequestMapping("/getUser")
    sysUser getUserByid(@RequestParam(value = "id") String id);
}
