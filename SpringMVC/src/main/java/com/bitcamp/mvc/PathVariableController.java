package com.bitcamp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {
	
	
	// http://localhost/mvc/guest/10
	@RequestMapping("/guest/{id}")
	public String getGuestMessage(
			
			@PathVariable("id") int id,
			Model model
			
			) {
		
		System.out.println(id);
		
		model.addAttribute("id", id);
		
		
		return "guest/view";
	}
	
	
	
	

}
