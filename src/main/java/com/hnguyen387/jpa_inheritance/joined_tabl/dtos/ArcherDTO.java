package com.hnguyen387.jpa_inheritance.joined_tabl.dtos;

import jakarta.validation.constraints.NotNull;

public class ArcherDTO extends InfantryDTO{
	@NotNull
	private Integer range;

	public ArcherDTO() {
		// TODO Auto-generated constructor stub
	}

	public ArcherDTO(String type, Integer moveSpeed, Integer durability, Integer attack, Integer range) {
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
