package com.quickr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quickr.model.UserAccount;
import com.quickr.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void createUser(UserAccount userAccount) {
		 
	//userRepository.save(new UserAccount(userAccount.getUserName(), userAccount.getEmailId(),userAccount.getPhoneNumber(),userAccount.getPassword()));
		userRepository.save(userAccount);
		
	}
}
