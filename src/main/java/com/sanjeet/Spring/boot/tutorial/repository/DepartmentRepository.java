package com.sanjeet.Spring.boot.tutorial.repository;

import com.sanjeet.Spring.boot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
