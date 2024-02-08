package com.tns.UserModule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	//Inserting data to database
	public void save(User user) {
		repo.save(user);
	}

}
