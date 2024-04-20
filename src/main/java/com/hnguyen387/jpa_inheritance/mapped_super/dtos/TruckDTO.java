package com.hnguyen387.jpa_inheritance.mapped_super.dtos;

public class TruckDTO extends VehicleDTO {
	private Integer maxLoad;
    private Boolean sleeperCab;
    
	public TruckDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public TruckDTO(Long id, String name, Integer seats, Integer maxLoad, Boolean sleeperCab) {
		super(id, name, seats);
		this.maxLoad = maxLoad;
		this.sleeperCab = sleeperCab;
	}
	public Integer getMaxLoad() {
		return maxLoad;
	}
	public void setMaxLoad(Integer maxLoad) {
		this.maxLoad = maxLoad;
	}
	public Boolean getSleeperCab() {
		return sleeperCab;
	}
	public void setSleeperCab(Boolean sleeperCab) {
		this.sleeperCab = sleeperCab;
	}
    
}
