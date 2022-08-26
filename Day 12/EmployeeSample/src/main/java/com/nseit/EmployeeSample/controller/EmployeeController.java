package com.nseit.EmployeeSample.controller;

import com.nseit.EmployeeSample.model.Employee;
import com.nseit.EmployeeSample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee1")

public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;

    @PostMapping
    public void add(@RequestBody Employee employee){
        employeeService.add(employee);

    }
    @GetMapping("/all")
    public List<Employee> view(){
        return employeeService.view();

    }@PutMapping
    public void update(@RequestBody Employee employee){
        employeeService.update(employee);

    }@DeleteMapping("/{id}")
    public void delete(@RequestBody int id){
        employeeService.delete(id);

    }

}
