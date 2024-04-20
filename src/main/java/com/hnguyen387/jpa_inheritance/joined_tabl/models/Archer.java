package com.hnguyen387.jpa_inheritance.joined_tabl.models;

import jakarta.persistence.Entity;

@Entity
public class Archer extends Infantry{
	private Integer range;

	public Archer() {
		// TODO Auto-generated constructor stub
	}

	public Archer(InfantryType type, Integer moveSpeed, Integer durability, Integer attack, Integer range) {
		super(type, moveSpeed, durability, attack);
		this.range = range;
	}

	public Integer getRange() {
		return range;
	}

	public void setRange(Integer range) {
		this.range = range;
	}
	
}
