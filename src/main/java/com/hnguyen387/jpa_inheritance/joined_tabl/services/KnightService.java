package com.hnguyen387.jpa_inheritance.joined_tabl.services;

import java.util.List;

import com.hnguyen387.jpa_inheritance.joined_tabl.dtos.KnightDTO;

public interface KnightService {
	KnightDTO createKnight(KnightDTO dto);
	List<KnightDTO> getListKnights();
}