package com.example.department.DepartmentService.controller;

import com.example.department.DepartmentService.entity.Department;
import com.example.department.DepartmentService.service.Departmentsevrice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {
    @Autowired
    private Departmentsevrice service;
    @GetMapping("/welcome")
    public String getWelcome()
    {
        return "Welcome To Department Service!!!!!!!!!!!!";
    }

    @GetMapping("/get/{id}")
    public Department FindDepartmentById(@PathVariable("id") long id)
    {
        return service.FindDepartmentById(id);
    }

    @GetMapping("/get")
    public Department getDepartmentService() {
        log.info("GETTTING THE ALL DEPARTMENT INFORMATION");
        return service.getDepartmentService();
    }


    @PostMapping("/add")
    public Department saveDepartment(@RequestBody Department department)
    {
        log.info("Department  added!!!");
        return (Department) service.saveDepartment(department);
    }
}
