package com.hnguyen387.jpa_inheritance.single_tabl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hnguyen387.jpa_inheritance.single_tabl.dtos.PaintingDTO;
import com.hnguyen387.jpa_inheritance.single_tabl.dtos.SculptureDTO;
import com.hnguyen387.jpa_inheritance.single_tabl.services.PaintingService;
import com.hnguyen387.jpa_inheritance.single_tabl.services.SculptureService;

@RestController
@RequestMapping("api/single_table")
@Validated
public class ArtPieceController {
	@Autowired
	private PaintingService paintingService;
	@Autowired
	private SculptureService sculptureService;
	
	
	@PostMapping("painting")
	public ResponseEntity<PaintingDTO> createPainting(
			@Validated
			@RequestBody PaintingDTO dto) {
		PaintingDTO savedPainting = paintingService.createPainting(dto);
		return new ResponseEntity<PaintingDTO>(savedPainting, HttpStatus.CREATED);
	}
	@PostMapping("sculpture")
	public ResponseEntity<SculptureDTO> createSculpture(
			@Validated
			@RequestBody SculptureDTO sculpture) {
		SculptureDTO savedSculpture = sculptureService.createSculpture(sculpture);
		return new ResponseEntity<SculptureDTO>(savedSculpture, HttpStatus.CREATED);
	}
}
