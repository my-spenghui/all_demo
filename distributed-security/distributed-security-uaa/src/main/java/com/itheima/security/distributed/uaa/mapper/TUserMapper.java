package com.itheima.security.distributed.uaa.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.itheima.security.distributed.uaa.entity.TPermission;
import com.itheima.security.distributed.uaa.entity.TUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author chenjiajin@Jowim.com
 * @since 2020-06-20
 */
public interface TUserMapper extends BaseMapper<TUser> {

    /**
     * 根据用户id查出用户的所有权限的id
     *
     * @param userId
     * @return
     */
    List<TPermission> findPermissionsByUserId(@Param("userId") String userId);

}
