package com.bitcamp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberRegForm {
	
	@RequestMapping("/member/regForm")
	public String getRegForm(Model model) {
		
		model.addAttribute("title", "일반회원");
		
		
		return "member/regForm";
		// /WEB-INF/views/member/regForm.jsp
	}

}
