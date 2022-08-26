package com.nseit.VehiclesOwner.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter

@NoArgsConstructor

public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "owner",cascade = CascadeType.ALL)
    private List<Vehicle> vehicle;

    public Owner(Integer id, String name, List<Vehicle> vehicle) {
        this.id = id;
        this.name = name;
        this.vehicle = vehicle;
    }
}
