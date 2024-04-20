package com.hnguyen387.jpa_inheritance.single_tabl.models;

import com.hnguyen387.jpa_inheritance.single_tabl.utils.PaintingTechnique;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
@DiscriminatorValue(value = "PAINTING")
public class Painting extends ArtPiece{
	@Enumerated(value = EnumType.STRING)
	private PaintingTechnique paintingTechnique;
    private Double width;
    private Double height;
    
	public Painting() {
		// TODO Auto-generated constructor stub
	}

	public Painting(String author, String title, PaintingTechnique paintingTechnique, Double width, Double height) {
		super(author, title);
		this.paintingTechnique = paintingTechnique;
		this.width = width;
		this.height = height;
	}

	public PaintingTechnique getPaintingTechnique() {
		return paintingTechnique;
	}

	public void setPaintingTechnique(PaintingTechnique paintingTechnique) {
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
