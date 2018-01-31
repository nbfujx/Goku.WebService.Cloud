package com.goku.cloud.sys.rest;

import com.goku.cloud.model.sysUser;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nbfujx on 2018/1/31.
 */
@RestController
public interface sysUserController {
    sysUser getUserByid(String id);
}
