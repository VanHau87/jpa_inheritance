package com.hnguyen387.jpa_inheritance.mapped_super.dtos;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class VehicleDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String name;
    private Integer seats;
    
	public VehicleDTO() {
		// TODO Auto-generated constructor stub
	}
	public VehicleDTO(Long id, String name, Integer seats) {
		this.id = id;
		this.name = name;
		this.seats = seats;
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
	public Integer getSeats() {
		return seats;
	}
	public void setSeats(Integer seats) {
		this.seats = seats;
	}
    
}
