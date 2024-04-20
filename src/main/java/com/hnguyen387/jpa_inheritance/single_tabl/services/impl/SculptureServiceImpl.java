package com.hnguyen387.jpa_inheritance.single_tabl.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnguyen387.jpa_inheritance.single_tabl.dtos.SculptureDTO;
import com.hnguyen387.jpa_inheritance.single_tabl.models.Sculpture;
import com.hnguyen387.jpa_inheritance.single_tabl.repos.SculptureRepository;
import com.hnguyen387.jpa_inheritance.single_tabl.services.SculptureService;
import com.hnguyen387.jpa_inheritance.single_tabl.utils.Material;

@Service
public class SculptureServiceImpl implements SculptureService{
	@Autowired
	private SculptureRepository repository;
	@Override
	public SculptureDTO createSculpture(SculptureDTO dto) {
		Sculpture sculpture = new Sculpture();
		BeanUtils.copyProperties(dto, sculpture);
		sculpture.setMaterial(Material.valueOf(dto.getMaterial()));
		Sculpture savedSculpture = repository.save(sculpture);
		BeanUtils.copyProperties(savedSculpture, dto, "id");
		return dto;
	}

}
