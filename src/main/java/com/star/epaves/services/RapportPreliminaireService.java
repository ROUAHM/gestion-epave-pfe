package com.star.epaves.services;
import com.star.epaves.entities.RapportPreliminaire;

public interface RapportPreliminaireService {
	public RapportPreliminaire addrapportpreliminaire( RapportPreliminaire rapportpreliminaire ) ;
	public RapportPreliminaire getrapportpreliminairebyid (Long id);
	public void deleteRapportPreliminaire( RapportPreliminaire rapportpreliminaire ) ;

}
