package com.bitcamp.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member/memberReg")
public class MemberRegController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String getForm(
			Model model, 
			@RequestParam(value="no", 
						  required=false, 
						  defaultValue="1") int num) {
		
		System.out.println(num);
		
		return "member/regForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView memberReg(
			HttpServletRequest request,
			@RequestParam(value="uid") String id,
			@RequestParam("upw") String pw,
			@RequestParam("uname") String name,
			@ModelAttribute("mem") Member member
			) {
		
		String uid = request.getParameter("uid");
		String upw = request.getParameter("upw");
		String uname = request.getParameter("uname");
		
		System.out.println(uid + " : " + upw + " : " + uname);
		System.out.println(id + " : " + pw + " : " + name);
		System.out.println(member);
		
		
		ModelAndView mv = new ModelAndView();
				
		//View name
		mv.setViewName("member/memberReg");
		
		mv.addObject("result", uid + " : " + upw + " : " + uname);
		mv.addObject("obj", id + " : " + pw + " : " + name);
		//mv.addObject("member", member);
		
		member.setPhoto("사진없음");
		
		
		
		
		
		
		return mv;		
	}
	
	
	
	
	
	
	
	
	
	

}
