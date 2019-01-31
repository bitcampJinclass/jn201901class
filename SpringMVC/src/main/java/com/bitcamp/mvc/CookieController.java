package com.bitcamp.mvc;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {

	@RequestMapping("/cookie/makeCookie")
	public String makeCookie(HttpServletResponse response) {
		
		Cookie c = new Cookie("Auth", "coolinhot");
		response.addCookie(c);
		
		return "cookie/make";
	}
	
	@RequestMapping("/cookie/viewCookie")
	public String viewCookie(
			
			@CookieValue("Auth") String cookie,
			@CookieValue(value="userid", defaultValue="noId") String userid,
			Model model
			
			) {
		
		System.out.println(cookie);
		System.out.println(userid);
		
		model.addAttribute("result", "서버에서 받은 쿠키 정보 : " + cookie);
		
		
		
		return "cookie/view";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
