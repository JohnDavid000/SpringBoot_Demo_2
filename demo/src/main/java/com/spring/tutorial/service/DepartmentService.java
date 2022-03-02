package com.spring.tutorial.service;

import java.util.List;

import com.spring.tutorial.entity.Department;

public interface DepartmentService {
    
    public List<Department> getAll();

    public Department getDepartmentById(Long departmentId);

    public Department createDepartment(Department department);

    public void deleteDepartment(Long departmentId);

    public Department updateDepartment(Long id, Department department);

    public List<Department> findByDepartmentName(String departmentName);
    
    public List<Department> findByDepartmentNameIgnoreCase(String departmentName);
}
