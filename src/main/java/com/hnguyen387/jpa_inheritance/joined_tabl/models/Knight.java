package com.hnguyen387.jpa_inheritance.joined_tabl.models;

import jakarta.persistence.Entity;

@Entity
public class Knight extends Infantry{
	private Boolean shield;

	public Knight() {
		// TODO Auto-generated constructor stub
	}

	public Knight(InfantryType type, Integer moveSpeed, Integer durability, Integer attack, Boolean shield) {
		super(type, moveSpeed, durability, attack);
		this.shield = shield;
	}

	public Boolean getShield() {
		return shield;
	}

	public void setShield(Boolean shield) {
		this.shield = shield;
	}
	
}
