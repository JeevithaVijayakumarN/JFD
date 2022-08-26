package com.nseit.EmployeeSample.repository;

import com.nseit.EmployeeSample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
