package com.login.dip.service;

import org.springframework.stereotype.Service;

import com.login.dip.bean.contactUs;
import com.login.dip.dao.contactDAO;

@Service
public interface contactService {
	
	public void save(contactDAO cc);

}
