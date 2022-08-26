package com.nseit.SpringBootSample1Jpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "position")

@Data

public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int p_id;
    private String p_name;

    @OneToMany(mappedBy = "position",cascade = CascadeType.ALL)
    private List<Employee> employee;




}
