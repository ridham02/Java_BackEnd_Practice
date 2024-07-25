package com.ridhamarora.Firstspringboot.tutorial.service;

import com.ridhamarora.Firstspringboot.tutorial.entity.Department;
import com.ridhamarora.Firstspringboot.tutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }
    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {

        Department db = departmentRepository.findById(departmentId).get();

        if(!Objects.equals(department.getDepartmentName(), "") && department.getDepartmentName() != null){
            db.setDepartmentName(department.getDepartmentName());
        }
        if(!Objects.equals(department.getDepartmentAddress(), "") && department.getDepartmentAddress() != null){
            db.setDepartmentAddress(department.getDepartmentAddress());
        }
        if(!Objects.equals(department.getDepartmentCode(), "") && department.getDepartmentCode() != null){
            db.setDepartmentCode(department.getDepartmentCode());
        }

        return db;
    }

    @Override
    public Department fetchDepartmentByName(String name) {
        return departmentRepository.findByDepartmentName(name);
    }
}
