package com.hnguyen387.jpa_inheritance.joined_tabl.dtos;

import jakarta.validation.constraints.NotNull;

public class KnightDTO extends InfantryDTO{
	@NotNull
	private Boolean shield;

	public KnightDTO() {
		// TODO Auto-generated constructor stub
	}

	public KnightDTO(String type, Integer moveSpeed, Integer durability, Integer attack, Boolean shield) {
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
