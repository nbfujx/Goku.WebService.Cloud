package com.goku.cloud.sys.mapper.ext;

import com.goku.cloud.model.sysUser;
import com.goku.cloud.sys.mapper.sysUserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import javax.print.DocFlavor;
import java.util.List;
import java.util.Map;

/**
 * Created by nbfujx on 2017/10/14.
 */
@Mapper
public interface sysUserExtMapper extends sysUserMapper {

    sysUser selectByUsername(String username);

}
