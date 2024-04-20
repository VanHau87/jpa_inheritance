package com.hnguyen387.jpa_inheritance.table_per_class.dtos;

public class FrostSpellDTO extends SpellDTO {
	private boolean freezing;
    private Integer freezeDuration;
	public FrostSpellDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public FrostSpellDTO(String name, Integer energyCost, Integer damage, boolean freezing, Integer freezeDuration) {
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
