package com.liuxm.youngmemory.mapper;


import com.liuxm.youngmemory.bean.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 */
public interface MenuMapper {
    List<Menu> getAllMenu();

    List<Menu> getMenusByHrId(Long hrId);

    List<Menu> menuTree();

    List<Long> getMenusByRid(Long rid);
}
