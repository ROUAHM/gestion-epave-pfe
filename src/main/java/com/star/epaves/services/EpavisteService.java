package com.star.epaves.services;

import com.star.epaves.entities.Epaviste;

public interface EpavisteService {
	public Epaviste addepaviste (Epaviste epaviste);
	//GETBYID 
	public Epaviste getepavistes (Epaviste epaviste);
	public Epaviste getEpavistebyid(Long id);
	public void deleteEpaviste (Epaviste epaviste);
}
