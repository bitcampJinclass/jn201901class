package com.bitcamp.mvc;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/member/login")
	public String login(HttpSession session) {
		
		session.setAttribute("loginInfo", "login");
		
		return "member/login";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
