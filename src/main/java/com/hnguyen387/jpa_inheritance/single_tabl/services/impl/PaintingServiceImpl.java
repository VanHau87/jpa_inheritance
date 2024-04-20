package com.hnguyen387.jpa_inheritance.single_tabl.services.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnguyen387.jpa_inheritance.single_tabl.dtos.PaintingDTO;
import com.hnguyen387.jpa_inheritance.single_tabl.models.Painting;
import com.hnguyen387.jpa_inheritance.single_tabl.repos.PaintingRepository;
import com.hnguyen387.jpa_inheritance.single_tabl.services.PaintingService;

@Service
public class PaintingServiceImpl implements PaintingService{
	@Autowired
	private PaintingRepository repository;

	@Override
	public PaintingDTO createPainting(PaintingDTO dto) {
		Painting painting = new Painting();
		BeanUtils.copyProperties(dto, painting);
		Painting savedPainting = repository.save(painting);
		BeanUtils.copyProperties(savedPainting, dto);
		return dto;
	}

}
