package com.example.department.DepartmentService.repository_dao;

import com.example.department.DepartmentService.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

    Department findDepartmentById(long id);
}
