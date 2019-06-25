package com.liuxm.youngmemory.job;

import com.liuxm.youngmemory.mapper.GetTableDataMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
@Component
@Configuration
@EnableScheduling
public class GetTableDataService {
    private static final Logger logger = LoggerFactory.getLogger(GetTableDataService.class);

    @Resource
    private GetTableDataMapper getTableDataMapper;

    @Scheduled(cron = "*/1 * * * * ?")
    public void execute() throws Exception{
        List resultList = getTableDataMapper.getTableData();
        System.out.println("123");
        System.out.println(resultList);
    }
}
