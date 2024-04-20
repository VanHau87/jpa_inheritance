package com.hnguyen387.jpa_inheritance.table_per_class.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnguyen387.jpa_inheritance.table_per_class.dtos.FrostSpellDTO;
import com.hnguyen387.jpa_inheritance.table_per_class.models.FrostSpell;
import com.hnguyen387.jpa_inheritance.table_per_class.repos.FrostSpellRepository;
import com.hnguyen387.jpa_inheritance.table_per_class.services.FrostSpellService;

@Service
public class FrostSpellServiceImpl implements FrostSpellService{
	@Autowired
	private FrostSpellRepository repository;
	@Override
	public FrostSpellDTO createFrostSpell(FrostSpellDTO dto) {
		FrostSpell frostSpell = new FrostSpell();
		BeanUtils.copyProperties(dto, frostSpell);
		var savedFrost = repository.save(frostSpell);
		BeanUtils.copyProperties(savedFrost, dto);
		return dto;
	}

}
