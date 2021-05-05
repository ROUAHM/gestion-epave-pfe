package com.star.epaves.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.star.epaves.entities.User;
import com.star.epaves.repos.UserRepository;
import com.star.epaves.services.UserService;

@Service("UserService")

public class UserserviceImpl implements UserService {
	@Autowired UserRepository userrepository ;
	
	@Override
	public User adduser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User getUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
