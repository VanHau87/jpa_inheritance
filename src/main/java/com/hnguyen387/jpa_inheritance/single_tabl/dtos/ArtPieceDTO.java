package com.hnguyen387.jpa_inheritance.single_tabl.dtos;

import jakarta.validation.constraints.NotBlank;

public class ArtPieceDTO {
	private Long id;
	@NotBlank(message = "Author is required")
    private String author;
	@NotBlank(message = "Title is required")
	private String title;
    
	public ArtPieceDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public ArtPieceDTO(String author, String title) {
		this.author = author;
		this.title = title;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
    
}
