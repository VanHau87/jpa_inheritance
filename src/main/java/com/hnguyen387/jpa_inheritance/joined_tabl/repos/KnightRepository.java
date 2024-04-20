package com.hnguyen387.jpa_inheritance.joined_tabl.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hnguyen387.jpa_inheritance.joined_tabl.models.Knight;

public interface KnightRepository extends JpaRepository<Knight, Long>{

}
