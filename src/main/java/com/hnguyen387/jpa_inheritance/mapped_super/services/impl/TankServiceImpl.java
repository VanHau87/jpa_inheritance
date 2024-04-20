package com.hnguyen387.jpa_inheritance.mapped_super.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnguyen387.jpa_inheritance.mapped_super.dtos.TankDTO;
import com.hnguyen387.jpa_inheritance.mapped_super.models.Tank;
import com.hnguyen387.jpa_inheritance.mapped_super.repos.TankRepository;
import com.hnguyen387.jpa_inheritance.mapped_super.services.TankService;

@Service
public class TankServiceImpl implements TankService{
	@Autowired
	private TankRepository repository;
	
	@Override
	public TankDTO createTank(TankDTO dto) {
		Tank tank = new Tank();
		BeanUtils.copyProperties(dto, tank);
		var savedTank = repository.save(tank);
		BeanUtils.copyProperties(savedTank, dto);
		return dto;
	}

}
