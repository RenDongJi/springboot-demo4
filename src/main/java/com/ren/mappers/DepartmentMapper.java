package com.ren.mappers;

import com.ren.model.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @project: springboot-demo4
 * @description:
 * @author: DongJi_Ren
 * @date: 2017/11/28 23:17.
 * @version: v1.0
 */
@Mapper
public interface DepartmentMapper {

    public List<Department> findDepartment();

}
