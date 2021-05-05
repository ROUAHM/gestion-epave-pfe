package com.star.epaves.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.star.epaves.entities.RapportPreliminaire;
import com.star.epaves.repos.RapportPreliminaireRepository;
import com.star.epaves.services.RapportPreliminaireService;
@Service("RapportPreliminaireService")
public class RapportPreliminaireServiceImpl implements RapportPreliminaireService  {
	@Autowired RapportPreliminaireRepository rapportpreliminairerepository ;
	
	@Override
	public RapportPreliminaire addrapportpreliminaire(RapportPreliminaire rapportpreliminaire) {
		return rapportpreliminairerepository.save(rapportpreliminaire) ;
	}
	@Override
	public RapportPreliminaire getrapportpreliminairebyid(Long id) {
		return rapportpreliminairerepository.findById(id).get();
	}
	@Override
	public void deleteRapportPreliminaire (RapportPreliminaire rapportpreliminaire) {
		rapportpreliminairerepository.delete(rapportpreliminaire);
	}

}
