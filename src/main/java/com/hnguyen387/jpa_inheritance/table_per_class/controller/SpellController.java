package com.hnguyen387.jpa_inheritance.table_per_class.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hnguyen387.jpa_inheritance.table_per_class.dtos.FireSpellDTO;
import com.hnguyen387.jpa_inheritance.table_per_class.dtos.FrostSpellDTO;
import com.hnguyen387.jpa_inheritance.table_per_class.services.FireSpellService;
import com.hnguyen387.jpa_inheritance.table_per_class.services.FrostSpellService;

@RestController
@RequestMapping("api/spell")
public class SpellController {
	@Autowired
	private FireSpellService fireSpellService;
	@Autowired
	private FrostSpellService frostSpellService;
	
	@PostMapping("fire")
	public ResponseEntity<FireSpellDTO> createFireSpell(@RequestBody FireSpellDTO dto) {
		var savedFire = fireSpellService.createFireSpell(dto);
		return new ResponseEntity<FireSpellDTO>(savedFire, HttpStatus.CREATED);
	}
	@PostMapping("frost")
	public ResponseEntity<FrostSpellDTO> createFrostSpell(@RequestBody FrostSpellDTO dto) {
		var savedFire = frostSpellService.createFrostSpell(dto);
		return new ResponseEntity<FrostSpellDTO>(savedFire, HttpStatus.CREATED);
	}
}
