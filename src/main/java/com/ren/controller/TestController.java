package com.ren.controller;

import com.ren.mappers.DepartmentMapper;
import com.ren.model.Department;
import com.ren.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @project: springboot-demo4
 * @description:2test
 * @author: DongJi_Ren
 * @date: 2017/11/28 23:21.
 * @version: v1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private DepartmentService departmentService;

    @RequestMapping("/findDepartment")
    public List<Department> findDepartment(){
        return departmentService.findDepartment();
    }
}
