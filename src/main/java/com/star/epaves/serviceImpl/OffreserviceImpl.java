package com.star.epaves.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.star.epaves.entities.Offre;
import com.star.epaves.repos.OffreRepository;
import com.star.epaves.services.OffreService;

@Service("OffreService")

public class OffreserviceImpl implements OffreService{
	@Autowired OffreRepository offrerepository ;

	@Override
	public Offre addoffre(Offre offre) {
		return offrerepository.save(offre) ;
	}
	@Override
	public Offre getOffrebyid(long id) {
		return offrerepository.findById(id).get();
	}
	@Override
	public void deleteOffre (Offre offre) {
		offrerepository.delete(offre);
	}
	
}