package com.star.epaves.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.star.epaves.entities.Client;
import com.star.epaves.repos.ClientRepository;
import com.star.epaves.services.ClientService;

@Service("ClientService")

public class ClientServiceImpl implements ClientService{
	@Autowired ClientRepository clientrepository ;
	@Override
	
	public Client addclient(Client client) {
		// TODO Auto-generated method stub
		return clientrepository.save(client) ;
	}

	@Override
	public Client getclients(Client client) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteClient (Client client) {
		clientrepository.delete(client);
	}

	@Override
	public Client getClientbyid(Long id) {
		// TODO Auto-generated method stub
		return clientrepository.findById(id).get(); 
	}

}
