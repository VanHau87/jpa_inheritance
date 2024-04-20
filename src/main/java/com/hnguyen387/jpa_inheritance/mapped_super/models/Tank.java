package com.hnguyen387.jpa_inheritance.mapped_super.models;

import jakarta.persistence.Entity;

@Entity
public class Tank extends Vehicle {
	private Integer firePower;

	public Tank() {
		// TODO Auto-generated constructor stub
	}

	public Tank(Long id, String name, Integer seats, Integer firePower) {
		super(id, name, seats);
		this.firePower = firePower;
	}

	public Integer getFirePower() {
		return firePower;
	}

	public void setFirePower(Integer firePower) {
		this.firePower = firePower;
	}
	
}
