package com.nseit.EmployeeSample.service;

import com.nseit.EmployeeSample.model.Employee;
import com.nseit.EmployeeSample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    public EmployeeRepository employeeRepository;

    public void add(Employee employee) {
        employeeRepository.save(employee);

    }

    public List<Employee> view() {
        return employeeRepository.findAll();

    }

    public void update(Employee employee) {
        employeeRepository.save(employee);

    }

    public void delete(int id) {
        List<Employee> employees = employeeRepository.findAll();
        for (Employee employee : employees)
            if (id == employee.getId()) {
                employeeRepository.delete(employee);
                break;
            }
    }
}
