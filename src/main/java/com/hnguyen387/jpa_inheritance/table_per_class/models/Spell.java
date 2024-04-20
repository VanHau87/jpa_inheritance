package com.hnguyen387.jpa_inheritance.table_per_class.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Spell {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String name;
    private Integer energyCost;
    private Integer damage;
	public Spell() {
		// TODO Auto-generated constructor stub
	}
	public Spell(String name, Integer energyCost, Integer damage) {
		super();
		this.name = name;
		this.energyCost = energyCost;
		this.damage = damage;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEnergyCost() {
		return energyCost;
	}
	public void setEnergyCost(Integer energyCost) {
		this.energyCost = energyCost;
	}
	public Integer getDamage() {
		return damage;
	}
	public void setDamage(Integer damage) {
		this.damage = damage;
	}
    
}
