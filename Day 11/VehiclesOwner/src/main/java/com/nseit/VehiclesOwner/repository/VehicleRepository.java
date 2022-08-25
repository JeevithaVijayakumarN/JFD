package com.nseit.VehiclesOwner.repository;

import com.nseit.VehiclesOwner.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {

}
