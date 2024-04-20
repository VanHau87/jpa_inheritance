package com.hnguyen387.jpa_inheritance.table_per_class.models;

import jakarta.persistence.Entity;

@Entity
public class FrostSpell extends Spell {
	private boolean freezing;
    private Integer freezeDuration;
	public FrostSpell() {
		// TODO Auto-generated constructor stub
	}
	
	public FrostSpell(String name, Integer energyCost, Integer damage, boolean freezing, Integer freezeDuration) {
		super(name, energyCost, damage);
		this.freezing = freezing;
		this.freezeDuration = freezeDuration;
	}
	public boolean isFreezing() {
		return freezing;
	}
	public void setFreezing(boolean freezing) {
		this.freezing = freezing;
	}
	public Integer getFreezeDuration() {
		return freezeDuration;
	}
	public void setFreezeDuration(Integer freezeDuration) {
		this.freezeDuration = freezeDuration;
	}
    
}
