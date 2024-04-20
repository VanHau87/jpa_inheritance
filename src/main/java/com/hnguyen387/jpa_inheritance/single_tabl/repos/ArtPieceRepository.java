package com.hnguyen387.jpa_inheritance.single_tabl.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.hnguyen387.jpa_inheritance.single_tabl.models.ArtPiece;

@NoRepositoryBean
public interface ArtPieceRepository extends JpaRepository<ArtPiece, Long>{

}
