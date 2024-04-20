package com.hnguyen387.jpa_inheritance.single_tabl.dtos;

import com.hnguyen387.jpa_inheritance.single_tabl.utils.Material;
import com.hnguyen387.jpa_inheritance.validation.ValidType;

public class SculptureDTO extends ArtPieceDTO{
	@ValidType(enumClass = Material.class, message = "Material must be a valid type")
	private String material;
    private Double weight;
    
	public SculptureDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public SculptureDTO(String author, String title, String material, Double weight) {
		super(author, title);
		this.material = material;
		this.weight = weight;
	}

	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
    
}
