package com.hnguyen387.jpa_inheritance.table_per_class.models;

import jakarta.persistence.Entity;

@Entity
public class FireSpell extends Spell{
	private Integer damageOverTime;
    private Integer damageOverTimeDuration;
	public FireSpell() {
		// TODO Auto-generated constructor stub
	}
	
	public FireSpell(String name, Integer energyCost, Integer damage, Integer damageOverTime, Integer damageOverTimeDuration) {
		super(name, energyCost, damage);
		this.damageOverTime = damageOverTime;
		this.damageOverTimeDuration = damageOverTimeDuration;
	}
	public Integer getDamageOverTime() {
		return damageOverTime;
	}
	public void setDamageOverTime(Integer damageOverTime) {
		this.damageOverTime = damageOverTime;
	}
	public Integer getDamageOverTimeDuration() {
		return damageOverTimeDuration;
	}
	public void setDamageOverTimeDuration(Integer damageOverTimeDuration) {
		this.damageOverTimeDuration = damageOverTimeDuration;
	}
    
}
