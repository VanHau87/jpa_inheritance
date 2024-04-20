package com.hnguyen387.jpa_inheritance.mapped_super.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hnguyen387.jpa_inheritance.mapped_super.models.Truck;

public interface TruckRepository extends JpaRepository<Truck, Long>{

}
