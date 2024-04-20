package com.hnguyen387.jpa_inheritance.joined_tabl.services;

import java.util.List;

import com.hnguyen387.jpa_inheritance.joined_tabl.dtos.ArcherDTO;

public interface ArcherService {
	ArcherDTO createArcher(ArcherDTO dto);
	List<ArcherDTO> getListArchers();
}
