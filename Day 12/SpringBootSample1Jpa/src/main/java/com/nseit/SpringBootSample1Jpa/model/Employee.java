package com.nseit.SpringBootSample1Jpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name = "employee")
@Data

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;

    @ManyToOne(optional = false)
    @JoinColumn(name = "position_id",nullable = false,referencedColumnName = "p_id")
    private Position position;

}
