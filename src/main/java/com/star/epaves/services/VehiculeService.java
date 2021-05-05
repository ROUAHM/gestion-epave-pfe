package com.star.epaves.services;

import com.star.epaves.entities.Vehicule;

public interface VehiculeService {
	public  Vehicule addvehicule ( Vehicule vehicule);
	public  Vehicule getvehiculebyid (long id);
	public void deleteVehicule ( Vehicule vehicule);


}
