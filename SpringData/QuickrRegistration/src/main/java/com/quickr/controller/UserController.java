package com.quickr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickr.model.UserAccount;
import com.quickr.service.UserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/quickr")
public class UserController {
	
	@Autowired
private UserService userService;
	
	
	@PostMapping("/users/create")
	public void createUser(@RequestBody UserAccount userAccount) {
		userService.createUser(userAccount);
			
	}
	

}
