package com.spring.tutorial.service;

import java.util.List;

import com.spring.tutorial.entity.Department;

public interface DepartmentService {
    
    public List<Department> getAll();

    public Department getDepartmentById(Long departmentId);

    public Department createDepartment(Department department);

    public void deleteDepartment(Long departmentId);
}