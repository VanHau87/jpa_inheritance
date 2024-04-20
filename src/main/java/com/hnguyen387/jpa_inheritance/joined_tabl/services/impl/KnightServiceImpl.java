package com.hnguyen387.jpa_inheritance.joined_tabl.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnguyen387.jpa_inheritance.joined_tabl.dtos.KnightDTO;
import com.hnguyen387.jpa_inheritance.joined_tabl.models.InfantryType;
import com.hnguyen387.jpa_inheritance.joined_tabl.models.Knight;
import com.hnguyen387.jpa_inheritance.joined_tabl.repos.KnightRepository;
import com.hnguyen387.jpa_inheritance.joined_tabl.services.KnightService;

@Service
public class KnightServiceImpl implements KnightService{
	@Autowired
	private KnightRepository repository;
	@Override
	public KnightDTO createKnight(KnightDTO dto) {
		Knight knight = new Knight();
		BeanUtils.copyProperties(dto, knight);
		knight.setType(InfantryType.valueOf(dto.getType()));
		var savedKnight = repository.save(knight);
		BeanUtils.copyProperties(savedKnight, dto);
		return dto;
	}
	@Override
	public List<KnightDTO> getListKnights() {
		List<Knight> knights = repository.findAll();
		List<KnightDTO> dtos = new ArrayList<>();
		knights.forEach(knight -> {
			KnightDTO dto = new KnightDTO();
			BeanUtils.copyProperties(knight, dto);
			dto.setType(knight.getType().toString());
			dtos.add(dto);
		});
		return dtos;
	}

}
