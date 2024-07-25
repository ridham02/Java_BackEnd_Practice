package com.ridhamarora.Firstspringboot.tutorial.service;

import com.ridhamarora.Firstspringboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department fetchDepartmentById(Long departmentId);

    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String name);
}
