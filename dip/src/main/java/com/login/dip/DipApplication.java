package com.login.dip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.login.dip.bean.User;
import com.login.dip.service.usersServiceImpl;

@SpringBootApplication
@ComponentScan("com.login.dip")
public class DipApplication {

	public static void main(String[] args) {
		SpringApplication.run(DipApplication.class, args);
	}
	
}
