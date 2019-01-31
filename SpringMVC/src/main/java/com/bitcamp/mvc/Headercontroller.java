package com.bitcamp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Headercontroller {
	
	
	@RequestMapping("header/view")
	public String getReferer(
			
			@RequestHeader("referer") String url,
			Model model
			
			) {
		
		System.out.println(url);
		
		model.addAttribute("url", url);
		
		
		return "header/view";
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
