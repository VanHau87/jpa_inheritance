package com.hnguyen387.jpa_inheritance.table_per_class.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnguyen387.jpa_inheritance.table_per_class.dtos.FireSpellDTO;
import com.hnguyen387.jpa_inheritance.table_per_class.models.FireSpell;
import com.hnguyen387.jpa_inheritance.table_per_class.repos.FireSpellRepository;
import com.hnguyen387.jpa_inheritance.table_per_class.services.FireSpellService;

@Service
public class FireSpellServiceImpl implements FireSpellService{
	@Autowired
	private FireSpellRepository repository;
	@Override
	public FireSpellDTO createFireSpell(FireSpellDTO dto) {
		FireSpell fireSpell = new FireSpell();
		BeanUtils.copyProperties(dto, fireSpell);
		var savedFire = repository.save(fireSpell);
		BeanUtils.copyProperties(savedFire, dto);
		return dto;
	}

}
