package com.star.epaves.services;

import com.star.epaves.entities.Offre;

public interface OffreService {
	public Offre addoffre (Offre offre);
	public Offre getOffrebyid (long id);
	public void deleteOffre (Offre offre);
	
}
