/*package com.quickr.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userAccount")
public class UserRegistrationAccount {
	
	{
		"userName":"Priya",
		"emailId":"cvs@gmail.com",
		"phoneNumber":"123456",
		"password":"cvs"
	}
	
	
	

	private String userName;
	@Id
	private String emailId;
	private long phoneNumber;
	private String password;
	//private List<Link> links=new ArrayList<>();
	
	Angular userAccount pojo class
 *   name: string;
    email: string;
    phonenumber: number;
    password: string;

	public UserRegistrationAccount() {
		
	}
	
	public UserRegistrationAccount(String emailId,String password) {
		
		this.emailId = emailId;
		this.password = password;
	}

	public UserRegistrationAccount(String userName, String emailId, long phoneNumber, String password) {
		super();
		
		this.userName = userName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}



	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserRegistrationAccount [userName=" + userName + ", emailId=" + emailId + ", phoneNumber=" + phoneNumber
				+ ", password=" + password + "]";
	}
	
}
*/



package com.quickr.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "userAccount")
public class UserRegistrationAccount {
	
	/*{
		"userName":"Priya",
		"emailId":"cvs@gmail.com",
		"phoneNumber":"123456",
		"password":"cvs"
	}*/
	
	
	

	private String name;
	@Id
	private String email;
	private long phonenumber;
	private String password;

	public UserRegistrationAccount() {
		
	}
	public UserRegistrationAccount(String name, String email, long phonenumber, String password) {
		super();
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserRegistrationAccount [name=" + name + ", email=" + email + ", phonenumber=" + phonenumber
				+ ", password=" + password + "]";
	}
	


	


	
}
