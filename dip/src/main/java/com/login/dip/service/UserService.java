package com.login.dip.service;

import org.springframework.stereotype.Service;

import com.login.dip.bean.User;
import com.login.dip.dao.UsersDAO;
@Service 
public interface UserService {
	
	public void save(User user);
	
	public int validUser(User user);
	
	public void deleteUser(int id);
	
	public void updateUser(int id);

}
