package com.star.epaves.services;
import com.star.epaves.entities.Enchere;

public interface EnchereService {
	public Enchere addenchere(Enchere enchere);
	public Enchere getencherebyid (Long id);
	public void deleteEnchere(Enchere enchere);


}
