package com.liuxm.youngmemory.mapper;

import org.apache.ibatis.annotations.Param;

/**
 */
public interface MenuRoleMapper {
    int deleteMenuByRid(@Param("rid") Long rid);

    int addMenu(@Param("rid") Long rid, @Param("mids") Long[] mids);
}
