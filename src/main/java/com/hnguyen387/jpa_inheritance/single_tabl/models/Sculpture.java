package com.hnguyen387.jpa_inheritance.single_tabl.models;

import com.hnguyen387.jpa_inheritance.single_tabl.utils.Material;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
@DiscriminatorValue(value = "SCULPTURE")
public class Sculpture extends ArtPiece{
	
	@Enumerated(value = EnumType.STRING)
	private Material material;
    private Double weight;
	
	public Sculpture() {
		// TODO Auto-generated constructor stub
	}

	public Sculpture(String author, String title, Material material, Double weight) {
		super(author, title);
		this.material = material;
		this.weight = weight;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
    
}
