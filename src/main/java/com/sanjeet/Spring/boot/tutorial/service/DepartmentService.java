package com.sanjeet.Spring.boot.tutorial.service;

import com.sanjeet.Spring.boot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();
}
