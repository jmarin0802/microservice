package com.dailycodebuffer.departmentservice.controller;

import com.dailycodebuffer.departmentservice.entity.Department;
import com.dailycodebuffer.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department save(@RequestBody Department department){
        //log.info("Inside save departmentcontroller");
        return departmentService.save(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long id){
        return departmentService.findDepartmentById(id);
    }

    @PutMapping("/")
    public Department updateDepartment(@RequestBody Department deparment){
        return departmentService.save(deparment);
    }

    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable("id") Long id){
        return departmentService.delete(id);
    }
}
