package com.ren.service.impl;

import com.ren.mappers.DepartmentMapper;
import com.ren.model.Department;
import com.ren.service.DepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @project: springboot-demo4
 * @description:
 * @author: DongJi_Ren
 * @date: 2017/11/28 23:24.
 * @version: v1.0
 */
@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> findDepartment() {
        return departmentMapper.findDepartment();
    }
}
