package com.star.epaves.services;

import com.star.epaves.entities.Compte;

public interface CompteService {

	public Compte addcompte (Compte compte);
	public Compte getcomptebyid (long id);
	public void deleteCompte (Compte compte);

}
