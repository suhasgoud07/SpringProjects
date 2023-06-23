package com.login.dip.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.login.dip.bean.contactUs;
import com.login.dip.dao.contactDAO;
import com.login.dip.repository.contactrepo;
import com.login.dip.repository.userRepository;

public class contactServiceImpl implements contactService {

	
	@Autowired
	private contactrepo crepo;
	
	@Override
	public void save(contactDAO cc) {
		contactUs d= new contactUs(cc);
		crepo.save(d);
		
	}

}
