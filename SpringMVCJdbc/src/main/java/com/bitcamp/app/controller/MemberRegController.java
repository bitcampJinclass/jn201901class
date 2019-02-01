package com.bitcamp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.app.model.Member;
import com.bitcamp.app.service.MemberRegService;
import com.bitcamp.app.service.MemberSelectService;

@Controller
public class MemberRegController {
	
	@Autowired
	private MemberRegService service;
	
	@Autowired
	private MemberSelectService selectService;
	

	@RequestMapping("/member/memberReg")
	public String insert() {
		
		int rcnt = service.inserMember();
		
		System.out.println("입력 결과 : " + rcnt);
		
		return "member/insert";
	}
	
	
	@RequestMapping("/member/memberReg1")
	public String insert1() {
		
		Member member = new Member();
		member.setEmail("ryuyj761@naver.com");
		member.setPassword("~!@!$%");
		member.setName("홍길동");
		
		System.out.println(member);
		
		int rcnt = service.insertMemberKey(member);
		
		System.out.println(member);
		
		return "member/insert";
	}
	
	@RequestMapping("/member/view")
	public String getMember(
			
			Model model		
			
			) {
		
		String email = "ryuyj@nate.com";
		Member member = selectService.selectByEmail(email);
		
		model.addAttribute("result", member);
		
		
		return "member/view";
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
