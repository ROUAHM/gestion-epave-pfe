package com.star.epaves.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.star.epaves.entities.Gestionnaire;
import com.star.epaves.repos.GestionnaireRepository;
import com.star.epaves.services.GestionnaireService;

@Service("GestionnaireService")

public class GestionnaireServiceImpl implements GestionnaireService {
	@Autowired GestionnaireRepository gestionnairerepository ;
	
	@Override
	public Gestionnaire addgestionnaire(Gestionnaire gestionnaire) {
		// TODO Auto-generated method stub
		return gestionnairerepository.save(gestionnaire) ;
	}

	@Override
	public Gestionnaire getGestionnaire(Gestionnaire gestionnaire) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteGestionnaire (Gestionnaire gestionnaire) {
		gestionnairerepository.delete(gestionnaire);
	}

	@Override
	public Gestionnaire getGestionnairebyid(Long id) {
		// TODO Auto-generated method stub
		return gestionnairerepository.findById(id).get();
	}

}
