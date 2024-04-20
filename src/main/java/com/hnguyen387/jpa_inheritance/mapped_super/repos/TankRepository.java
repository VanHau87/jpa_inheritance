package com.hnguyen387.jpa_inheritance.mapped_super.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hnguyen387.jpa_inheritance.mapped_super.models.Tank;

public interface TankRepository extends JpaRepository<Tank, Long>{

}
