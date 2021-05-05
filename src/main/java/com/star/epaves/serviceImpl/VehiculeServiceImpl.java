package com.star.epaves.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.star.epaves.entities.Vehicule;
import com.star.epaves.repos.VehiculeRepository;
import com.star.epaves.services.VehiculeService;

@Service("VehiculeService")


public class VehiculeServiceImpl implements VehiculeService {
	@Autowired VehiculeRepository vehiculerepository ;
	@Override
	public Vehicule addvehicule(Vehicule vehicule) {
		// TODO Auto-generated method stub
		return vehiculerepository.save(vehicule) ;
	}
	@Override
	public Vehicule getvehiculebyid(long id) {
		// TODO Auto-generated method stub
		return vehiculerepository.findById(id).get();
	}

	@Override
	public void deleteVehicule (Vehicule vehicule) {
		vehiculerepository.delete(vehicule);
	}
	

}
