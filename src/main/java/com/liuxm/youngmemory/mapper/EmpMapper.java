package com.liuxm.youngmemory.mapper;

import com.liuxm.youngmemory.bean.Employee;
import com.liuxm.youngmemory.bean.Nation;
import com.liuxm.youngmemory.bean.PoliticsStatus;
import org.apache.ibatis.annotations.Param;


import java.util.Date;
import java.util.List;

/**
 */
public interface EmpMapper {
    List<Nation> getAllNations();

    List<PoliticsStatus> getAllPolitics();

    int addEmp(Employee employee);

    Long getMaxWorkID();

    List<Employee> getEmployeeByPage(@Param("start") Integer start, @Param("size") Integer size, @Param("keywords") String keywords, @Param("politicId") Long politicId, @Param("nationId") Long nationId, @Param("posId") Long posId, @Param("jobLevelId") Long jobLevelId, @Param("engageForm") String engageForm, @Param("departmentId") Long departmentId, @Param("startBeginDate") Date startBeginDate, @Param("endBeginDate") Date endBeginDate);

    Long getCountByKeywords(@Param("keywords") String keywords, @Param("politicId") Long politicId, @Param("nationId") Long nationId, @Param("posId") Long posId, @Param("jobLevelId") Long jobLevelId, @Param("engageForm") String engageForm, @Param("departmentId") Long departmentId, @Param("startBeginDate") Date startBeginDate, @Param("endBeginDate") Date endBeginDate);

    int updateEmp(@Param("emp") Employee employee);

    int deleteEmpById(@Param("ids") String[] ids);

    int addEmps(@Param("emps") List<Employee> emps);

    List<Employee> getEmployeeByPageShort(@Param("start") int start, @Param("size") Integer size);
}
