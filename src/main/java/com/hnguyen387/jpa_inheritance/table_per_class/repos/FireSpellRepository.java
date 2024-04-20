package com.hnguyen387.jpa_inheritance.table_per_class.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hnguyen387.jpa_inheritance.table_per_class.models.FireSpell;

public interface FireSpellRepository extends JpaRepository<FireSpell, Long>{

}
