package com.hnguyen387.jpa_inheritance.joined_tabl.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hnguyen387.jpa_inheritance.joined_tabl.dtos.ArcherDTO;
import com.hnguyen387.jpa_inheritance.joined_tabl.dtos.KnightDTO;
import com.hnguyen387.jpa_inheritance.joined_tabl.services.ArcherService;
import com.hnguyen387.jpa_inheritance.joined_tabl.services.KnightService;

@RestController
@RequestMapping("api/joined_table")
public class InfantryController {
	@Autowired
	private ArcherService archerService;
	@Autowired
	private KnightService knightService;
	
	@PostMapping("archer")
	public ResponseEntity<ArcherDTO> createArcher(
			@Validated
			@RequestBody ArcherDTO dto) {
		var savedArcher = archerService.createArcher(dto);
		return new ResponseEntity<ArcherDTO>(savedArcher, HttpStatus.CREATED);
	}
	@PostMapping("knight")
	public ResponseEntity<KnightDTO> createKnight(
			@Validated
			@RequestBody KnightDTO dto) {
		var savedKnight = knightService.createKnight(dto);
		return new ResponseEntity<KnightDTO>(savedKnight, HttpStatus.CREATED);
	}
	@GetMapping("archers")
	public ResponseEntity<List<ArcherDTO>> getListArchers() {
		List<ArcherDTO> list = archerService.getListArchers();
		return new ResponseEntity<List<ArcherDTO>>(list, HttpStatus.OK);
	}
	@GetMapping("knights")
	public ResponseEntity<List<KnightDTO>> getListKnights() {
		List<KnightDTO> list = knightService.getListKnights();
		return new ResponseEntity<List<KnightDTO>>(list, HttpStatus.OK);
	}
}
