package com.shovik.school_ms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shovik.school_ms.entity.LoginForm;

@Controller
public class LoginController {
	
	//to get LoginForm page
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginForm() {
		
		return "login";
	}
	
	//to check credentials
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute(name="loginForm") LoginForm loginForm, Model model) {
		
		String username = loginForm.getUsername();
		String password = loginForm.getPassword();
		
		if("admin".equals(username) && "admin".equals(password)) {
			return "home";
			}
		model.addAttribute("invalidCredentials" , true);
		
	 return "login";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String getHome() {
		
		return "home";
	}

}
