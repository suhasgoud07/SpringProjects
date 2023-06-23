package com.login.dip.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.login.dip.bean.User;
import com.login.dip.dao.UsersDAO;
import com.login.dip.repository.userRepository;

public class usersServiceImpl implements UserService{

	@Autowired
	private userRepository repo;
	@Override
	public void save(User user) {
		repo.save(user);
		
	}

	@Override
	public int validUser(User user) {
		
		
		
		return 1 ;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(int id) {
		// TODO Auto-generated method stub
		
	}

}
