package com.hnguyen387.jpa_inheritance.single_tabl.dtos;

import com.hnguyen387.jpa_inheritance.single_tabl.utils.PaintingTechnique;
import com.hnguyen387.jpa_inheritance.validation.ValidType;

public class PaintingDTO extends ArtPieceDTO{
	
	@ValidType(enumClass = PaintingTechnique.class, 
			message = "Painting technique must be a valid type")
	private String paintingTechnique;
    private Double width;
    private Double height;
    
	public PaintingDTO() {
		// TODO Auto-generated constructor stub
	}

	public PaintingDTO(String author, String title, String paintingTechnique, Double width, Double height) {
		super(author, title);
		this.paintingTechnique = paintingTechnique;
		this.width = width;
		this.height = height;
	}
	public String getPaintingTechnique() {
		return paintingTechnique;
	}
	public void setPaintingTechnique(String paintingTechnique) {
		this.paintingTechnique = paintingTechnique;
	}
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
    
}
