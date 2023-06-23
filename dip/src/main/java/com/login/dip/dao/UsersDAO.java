package com.login.dip.dao;

import com.login.dip.bean.User;

import lombok.Data;


@Data
public class UsersDAO {
	 private Integer id;

	  private String name;

	  private String email;
	  
	  private String password;
	  
	  public UsersDAO()
	  {
		 
		  this.name=name;
		  this.email=password;  
	  }
	  
	  public UsersDAO(User user)
	  {
		  
		  this.name=user.getName();
		  this.email=user.getEmail();
	  }
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
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
	

}
