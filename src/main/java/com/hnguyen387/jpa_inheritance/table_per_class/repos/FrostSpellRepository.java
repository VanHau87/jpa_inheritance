package com.hnguyen387.jpa_inheritance.table_per_class.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hnguyen387.jpa_inheritance.table_per_class.models.FrostSpell;

public interface FrostSpellRepository extends JpaRepository<FrostSpell, Long>{

}
