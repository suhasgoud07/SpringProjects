package com.login.dip.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.login.dip.bean.User;
import com.login.dip.bean.contactUs;
import com.login.dip.dao.UsersDAO;
import com.login.dip.dao.contactDAO;
import com.login.dip.repository.contactrepo;
import com.login.dip.repository.userRepository;
import com.login.dip.service.UserService;
import com.login.dip.service.contactService;


@Controller
public class loginController {
	@Autowired
	private userRepository repo;
	
	@Autowired
	private contactrepo crepo;
	
	int x=101;
	 UserService service;
	contactService ser;
	@GetMapping("/home")
	public String home()
	{
		return "index";
	}
	@GetMapping("/home1")
	public String home(Model model)
	{
		model.addAttribute("loginuser",new User());
		return "Home";
	}
/*-----------------LoginPage------------------*/
	@GetMapping("/login")
	public String login(Model model)
	{
		model.addAttribute("loginuser",new User());
		return "log";
	}
	
	@PostMapping("/loginhandler")
	public String Register1(Model model,@ModelAttribute("loginuser") User user1 )
	{
List<User> list=new ArrayList<>();
list.addAll(repo.findAll());
for(User user3: list)
{
	if(user3.getName().equals(user1.getName())&&user3.getPassword().equals(user1.getPassword()))
	{
		
		model.addAttribute("username", user1.getName().toUpperCase());
		return "UserH";
		
	}
}

		return "Error" ;
	}
	
/*------------------CONTACT US TAB-------------------------*/
	@GetMapping("/Contacts")
	public String contact(Model model)
	{
		model.addAttribute("query", new contactUs());
		return "contact";
	}
	@PostMapping("/ConHandler")
	public String contactHandler(@ModelAttribute("query") contactUs contactus )
	{    x=x+1;
		contactus.setU_id(x);
		crepo.save(contactus);
			
				return "sucessful";
		
	}
/*--------------------AboutMe---------------------------------------*/
	
	@GetMapping("/aboutMe")
	public String aboutMe()
	{
		return "AboutMe";
	}
	
	
/*---------------Register--------------------------------------------*/	
	@GetMapping("/registers")
	public String register1(Model model)
	{
		model.addAttribute("userss",new User());
		return "registering";
	}
	@PostMapping("/register1")
	public String Register(@ModelAttribute("userss") User user )
	{
		repo.save(user);
		return "log";
	}
	
	/*------------------Destination-Controller---------------*/
	@GetMapping("/Ladakh")
	public String DestinyLadakh(Model model)
	{
		return "DtnyLadakh";
	}

}
