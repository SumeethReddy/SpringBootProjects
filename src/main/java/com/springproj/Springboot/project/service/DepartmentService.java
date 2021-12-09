package com.springproj.Springboot.project.service;

import com.springproj.Springboot.project.entity.Department;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentId(Long departmentId);

    public void deleteDepartmentID(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);
}
