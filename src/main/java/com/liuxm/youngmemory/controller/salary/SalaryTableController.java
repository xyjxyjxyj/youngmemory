package com.liuxm.youngmemory.controller.salary;


import com.liuxm.youngmemory.bean.Department;
import com.liuxm.youngmemory.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 */
@RestController
@RequestMapping("/salary/table")
public class SalaryTableController {
    @Autowired
    DepartmentService departmentService;
    @RequestMapping("/deps")
    public List<Department> departments() {
        return departmentService.getAllDeps();
    }
}
