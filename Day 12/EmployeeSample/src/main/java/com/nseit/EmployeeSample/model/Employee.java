package com.nseit.EmployeeSample.model;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter


public class Employee {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;

}
