package com.star.epaves.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.star.epaves.entities.Epaviste;
import com.star.epaves.repos.EpavisteRepository;
import com.star.epaves.services.EpavisteService;

@Service("EpavisteService")
public class EpavisteServiceImpl implements EpavisteService{
	@Autowired EpavisteRepository epavisterepository ;
	@Override
	
	public Epaviste addepaviste(Epaviste epaviste) {
		// TODO Auto-generated method stub
		return epavisterepository.save(epaviste) ;
	}

	@Override
	public Epaviste getepavistes(Epaviste epaviste) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteEpaviste (Epaviste epaviste) {
		epavisterepository.delete(epaviste);
	}

	@Override
	public Epaviste getEpavistebyid(Long id) {
		// TODO Auto-generated method stub
		return epavisterepository.findById(id).get();
	}

}