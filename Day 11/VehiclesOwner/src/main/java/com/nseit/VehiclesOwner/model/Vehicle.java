package com.nseit.VehiclesOwner.model;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter

public class Vehicle {
    @Id
    @GeneratedValue
    public int id;
    public String vehicleName;
    private String vehicleModel;

    private Owner owner;

    public Vehicle(String vehicleModel, Owner owner) {
        this.vehicleModel = vehicleModel;
        this.owner = owner;
    }
}
