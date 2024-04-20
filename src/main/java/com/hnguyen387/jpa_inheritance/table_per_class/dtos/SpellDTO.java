package com.hnguyen387.jpa_inheritance.table_per_class.dtos;

public abstract class SpellDTO {
	private Long id;
    private String name;
    private Integer energyCost;
    private Integer damage;
	public SpellDTO() {
		// TODO Auto-generated constructor stub
	}
	public SpellDTO(String name, Integer energyCost, Integer damage) {
		super();
		this.name = name;
		this.energyCost = energyCost;
		this.damage = damage;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEnergyCost() {
		return energyCost;
	}
	public void setEnergyCost(Integer energyCost) {
		this.energyCost = energyCost;
	}
	public Integer getDamage() {
		return damage;
	}
	public void setDamage(Integer damage) {
		this.damage = damage;
	}
    
}
