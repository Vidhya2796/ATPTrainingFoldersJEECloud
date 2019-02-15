package com.quickr.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.quickr.model.UserRegistrationAccount;

public interface UserRepository extends MongoRepository<UserRegistrationAccount, String>{
	
}
