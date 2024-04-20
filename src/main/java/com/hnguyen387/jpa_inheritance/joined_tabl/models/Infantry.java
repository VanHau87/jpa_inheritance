package com.hnguyen387.jpa_inheritance.joined_tabl.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Infantry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private InfantryType type;
    private Integer moveSpeed;
    private Integer durability;
    private Integer attack;
    
	public Infantry() {
		// TODO Auto-generated constructor stub
	}

	public Infantry(InfantryType type, Integer moveSpeed, Integer durability, Integer attack) {
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

	public InfantryType getType() {
		return type;
	}

	public void setType(InfantryType type) {
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
