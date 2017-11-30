package com.ren.service;

import com.ren.model.Department;

import java.util.List;

/**
 * @project: springboot-demo4
 * @description:
 * @author: DongJi_Ren
 * @date: 2017/11/28 23:23.
 * @version: v1.0
 */
public interface DepartmentService {
    public List<Department> findDepartment();
}
