package com.liuxm.youngmemory.mapper;

import com.liuxm.youngmemory.bean.Salary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 */
public interface SalaryMapper {
    int addSalary(@Param("salary") Salary salary);

    List<Salary> getAllSalary();

    int updateSalary(@Param("salary") Salary salary);

    int deleteSalary(@Param("ids") String[] ids);

    int deleteSalaryByEid(@Param("eid") Long eid);

    int addSidAndEid(@Param("sid") Integer sid, @Param("eid") Long eid);
}
