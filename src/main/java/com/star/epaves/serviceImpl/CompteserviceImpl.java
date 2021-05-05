package com.star.epaves.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.star.epaves.entities.Compte;
import com.star.epaves.repos.CompteRepository;
import com.star.epaves.services.CompteService;
@Service("CompteService")

public class CompteserviceImpl implements CompteService{
	@Autowired CompteRepository compterepository ;
	@Override
	public Compte addcompte(Compte compte) {
		// TODO Auto-generated method stub
		return compterepository.save(compte) ;
	}
	@Override
	public void deleteCompte (Compte compte) {
		compterepository.delete(compte);
	}
	@Override
	public Compte getcomptebyid(long id) {
		// TODO Auto-generated method stub
		return compterepository.findById(id).get();
	}

}
