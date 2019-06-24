package com.liuxm.youngmemory.mapper;

import com.liuxm.youngmemory.bean.JobLevel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 */
public interface JobLevelMapper {
    JobLevel getJobLevelByName(String name);

    int addJobLevel(@Param("jobLevel") JobLevel jobLevel);

    List<JobLevel> getAllJobLevels();

    int deleteJobLevelById(@Param("ids") String[] ids);

    int updateJobLevel(@Param("jobLevel") JobLevel jobLevel);
}
