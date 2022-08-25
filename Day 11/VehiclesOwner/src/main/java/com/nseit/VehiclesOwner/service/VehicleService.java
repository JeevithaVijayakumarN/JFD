package com.nseit.VehiclesOwner.service;

import com.nseit.VehiclesOwner.model.Vehicle;
import com.nseit.VehiclesOwner.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;
    public void add(Vehicle vehicle){
        vehicleRepository.save(vehicle);


    }
    public void update(Vehicle vehicle){
        vehicleRepository.save(vehicle);

    }public void view(){


    }public void delete(){

    }
}
