package com.star.epaves.services;
import com.star.epaves.entities.Expert;


public interface ExpertService {

	public Expert addexpert (Expert expert);
	//GETBYID 
	public Expert getexperts (Expert expert);
	public Expert getExpertbyid(Long id);
	public void deleteExpert (Expert expert);

}
