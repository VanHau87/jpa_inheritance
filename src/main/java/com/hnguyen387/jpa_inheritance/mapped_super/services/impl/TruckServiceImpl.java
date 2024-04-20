package com.hnguyen387.jpa_inheritance.mapped_super.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnguyen387.jpa_inheritance.mapped_super.dtos.TruckDTO;
import com.hnguyen387.jpa_inheritance.mapped_super.models.Truck;
import com.hnguyen387.jpa_inheritance.mapped_super.repos.TruckRepository;
import com.hnguyen387.jpa_inheritance.mapped_super.services.TruckService;

@Service
public class TruckServiceImpl implements TruckService{
	@Autowired
	private TruckRepository repository;
	@Override
	public TruckDTO createTruck(TruckDTO dto) {
		Truck truck = new Truck();
		BeanUtils.copyProperties(dto, truck);
		var savedTruck = repository.save(truck);
		BeanUtils.copyProperties(savedTruck, dto);
		return dto;
	}

}
