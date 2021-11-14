package com.example.department.DepartmentService.service;

import com.example.department.DepartmentService.entity.Department;
import com.example.department.DepartmentService.repository_dao.DepartmentRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class Departmentsevrice {
    @Autowired
    private DepartmentRepo departmentRepo;

    public List<Department> saveDepartment(Department department) {
        log.info("SAVE THE DEPARTMENT OF DEPARTMENT SERVICE");
        return (List<Department>) departmentRepo.save(department);
    }
   public Department FindDepartmentById(long id)
   {
      log.info("GETTING THE DEPARTMENT UISNG ID");
       return departmentRepo.findDepartmentById(id);
   }
    public Department getDepartmentService() {
        log.info("Providing all service to log department");
        return  departmentRepo.getById(getDepartmentService().getId());
    }
}
