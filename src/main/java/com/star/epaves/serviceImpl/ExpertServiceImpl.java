package com.star.epaves.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.star.epaves.entities.Expert;
import com.star.epaves.repos.ExpertRepository;
import com.star.epaves.services.ExpertService;

@Service("ExpertService")

public class ExpertServiceImpl implements ExpertService{
	@Autowired ExpertRepository expertrepository ;
	@Override
	
	public Expert addexpert(Expert expert) {
		// TODO Auto-generated method stub
		return expertrepository.save(expert) ;
	}

	@Override
	public Expert getexperts(Expert expert) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteExpert (Expert expert) {
		expertrepository.delete(expert);
	}

	@Override
	public Expert getExpertbyid(Long id) {
		// TODO Auto-generated method stub
		return expertrepository.findById(id).get();}

}
