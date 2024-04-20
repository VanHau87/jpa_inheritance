package com.hnguyen387.jpa_inheritance.mapped_super.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hnguyen387.jpa_inheritance.mapped_super.dtos.TankDTO;
import com.hnguyen387.jpa_inheritance.mapped_super.dtos.TruckDTO;
import com.hnguyen387.jpa_inheritance.mapped_super.services.TankService;
import com.hnguyen387.jpa_inheritance.mapped_super.services.TruckService;

@RestController
@RequestMapping("api/mapped")
public class VehicleController {
	@Autowired
	private TruckService truckService;
	@Autowired
	private TankService tankService;
	
	@PostMapping("truck")
	public ResponseEntity<TruckDTO> createTruck(@RequestBody TruckDTO dto) {
		var savedTruck = truckService.createTruck(dto);
		return new ResponseEntity<TruckDTO>(savedTruck, HttpStatus.CREATED);
	}
	@PostMapping("tank")
	public ResponseEntity<TankDTO> createTank(@RequestBody TankDTO dto) {
		var savedTank = tankService.createTank(dto);
		return new ResponseEntity<TankDTO>(savedTank, HttpStatus.CREATED);
	}
}
