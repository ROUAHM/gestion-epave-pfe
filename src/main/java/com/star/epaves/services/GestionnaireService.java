package com.star.epaves.services;

import com.star.epaves.entities.Gestionnaire;

public interface GestionnaireService {
	public Gestionnaire addgestionnaire (Gestionnaire gestionnaire);
	//GETBYID 
		public Gestionnaire getGestionnaire(Gestionnaire gestionnaire);
		public Gestionnaire getGestionnairebyid(Long id);
		public void deleteGestionnaire (Gestionnaire gestionnaire);

		
}

