package com.hnguyen387.jpa_inheritance.joined_tabl.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnguyen387.jpa_inheritance.joined_tabl.dtos.ArcherDTO;
import com.hnguyen387.jpa_inheritance.joined_tabl.models.Archer;
import com.hnguyen387.jpa_inheritance.joined_tabl.models.InfantryType;
import com.hnguyen387.jpa_inheritance.joined_tabl.repos.ArcherRepository;
import com.hnguyen387.jpa_inheritance.joined_tabl.services.ArcherService;

@Service
public class ArcherServiceImpl implements ArcherService{
	@Autowired
	private ArcherRepository repository;
	@Override
	public ArcherDTO createArcher(ArcherDTO dto) {
		Archer archer = new Archer();
		BeanUtils.copyProperties(dto, archer);
		archer.setType(InfantryType.valueOf(dto.getType()));
		var savedArcher = repository.save(archer);
		BeanUtils.copyProperties(savedArcher, dto);
		return dto;
	}
	@Override
	public List<ArcherDTO> getListArchers() {
		List<Archer> archers = repository.findAll();
		List<ArcherDTO> dtos = new ArrayList<>();
		archers.forEach(archer -> {
			ArcherDTO dto = new ArcherDTO();
			BeanUtils.copyProperties(archer, dto);
			dto.setType(archer.getType().toString());
			dtos.add(dto);
		});
		return dtos;
	}

}
