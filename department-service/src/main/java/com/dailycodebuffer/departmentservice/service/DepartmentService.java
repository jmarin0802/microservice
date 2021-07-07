package com.dailycodebuffer.departmentservice.service;

import com.dailycodebuffer.departmentservice.entity.Department;
import com.dailycodebuffer.departmentservice.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo departmentRepo;

    public Department save(Department department) {
        return departmentRepo.save(department);
    }

    public Department findDepartmentById(Long id) {
        return departmentRepo.findByDepartmentId(id);
    }

    public String delete(Long id) {
        departmentRepo.delete(departmentRepo.findByDepartmentId(id));
        return "Eliminado "+ id;
    }
}
