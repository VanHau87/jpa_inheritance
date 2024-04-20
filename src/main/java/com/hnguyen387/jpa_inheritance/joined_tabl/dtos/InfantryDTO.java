package com.hnguyen387.jpa_inheritance.joined_tabl.dtos;

import com.hnguyen387.jpa_inheritance.joined_tabl.models.InfantryType;
import com.hnguyen387.jpa_inheritance.validation.ValidType;

public class InfantryDTO {
	private Long id;
	@ValidType(enumClass = InfantryType.class, message = "Please provide a valid type")
	private String type;
    private Integer moveSpeed;
    private Integer durability;
    private Integer attack;
    
	public InfantryDTO() {
		// TODO Auto-generated constructor stub
	}
	public InfantryDTO(String type, Integer moveSpeed, Integer durability, Integer attack) {
		this.type = type;
		this.moveSpeed = moveSpeed;
		this.durability = durability;
		this.attack = attack;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getMoveSpeed() {
		return moveSpeed;
	}
	public void setMoveSpeed(Integer moveSpeed) {
		this.moveSpeed = moveSpeed;
	}
	public Integer getDurability() {
		return durability;
	}
	public void setDurability(Integer durability) {
		this.durability = durability;
	}
	public Integer getAttack() {
		return attack;
	}
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
    
}
