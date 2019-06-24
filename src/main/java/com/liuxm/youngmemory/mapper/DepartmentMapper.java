package com.liuxm.youngmemory.mapper;

import com.liuxm.youngmemory.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 */
@Mapper
public interface DepartmentMapper {
    void addDep(@Param("dep") Department department);

    void deleteDep(@Param("dep") Department department);

    List<Department> getDepByPid(Long pid);

    List<Department> getAllDeps();
}
