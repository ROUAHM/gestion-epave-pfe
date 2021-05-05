package com.star.epaves.services;

import com.star.epaves.entities.Client;

public interface ClientService {
	public Client addclient (Client client);
	//GETBYID 
	public Client getclients (Client client);
	public Client getClientbyid(Long id);
	public void deleteClient (Client client);
	}
