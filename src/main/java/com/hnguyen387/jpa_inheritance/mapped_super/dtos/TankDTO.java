package com.hnguyen387.jpa_inheritance.mapped_super.dtos;

public class TankDTO extends VehicleDTO {
	private Integer firePower;

	public TankDTO() {
		// TODO Auto-generated constructor stub
	}

	public TankDTO(Long id, String name, Integer seats, Integer firePower) {
		super(id, name, seats);
		this.firePower = firePower;
	}

	public Integer getFirePower() {
		return firePower;
	}

	public void setFirePower(Integer firePower) {
		this.firePower = firePower;
	}
	
}
