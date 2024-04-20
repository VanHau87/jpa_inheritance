package com.hnguyen387.jpa_inheritance.single_tabl.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hnguyen387.jpa_inheritance.single_tabl.models.Painting;

public interface PaintingRepository extends JpaRepository<Painting, Integer>{

}
