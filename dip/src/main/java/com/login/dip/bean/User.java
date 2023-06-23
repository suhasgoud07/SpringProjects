package com.login.dip.bean;

import javax.persistence.SequenceGenerator;

import com.login.dip.dao.UsersDAO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

	public class User {
	  @Id
	  @GeneratedValue(generator= "user_gen" ,strategy = GenerationType.IDENTITY)
	  @SequenceGenerator(name="user_gen", sequenceName="user_seq", initialValue=11,allocationSize=1)
	  private Integer id;

	  private String name;
       
	
	  private String email;
	  
	  private String password;
	  public User()
	  {
		  
		  this.name=name;
		  this.email=email; 
		  this.password=password;
	  }
	  public User(UsersDAO userDAO)
	  {
		  this.name=userDAO.getName();
		  this.email=userDAO.getEmail();
		  this.password=userDAO.getPassword();
		  
	  }
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	  

	  
	}
