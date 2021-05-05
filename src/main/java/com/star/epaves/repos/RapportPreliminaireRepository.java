package com.star.epaves.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.star.epaves.entities.RapportPreliminaire;
@Repository("rapportpreliminaireRepository")
public interface RapportPreliminaireRepository extends JpaRepository<RapportPreliminaire, Long> {
	


}
