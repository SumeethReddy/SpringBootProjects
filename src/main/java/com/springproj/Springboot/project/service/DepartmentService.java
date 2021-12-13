package com.springproj.Springboot.project.service;

import com.springproj.Springboot.project.entity.Department;
import com.springproj.Springboot.project.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentId(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentID(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}
