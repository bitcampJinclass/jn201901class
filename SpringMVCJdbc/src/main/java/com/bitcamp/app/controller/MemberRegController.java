package com.bitcamp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.app.service.MemberRegService;

@Controller
public class MemberRegController {
	
	@Autowired
	private MemberRegService service;

	@RequestMapping("/member/memberReg")
	public String insert() {
		
		int rcnt = service.inserMember();
		
		System.out.println("입력 결과 : " + rcnt);
		
		return "member/insert";
	}
	
	
	
	
	
	
	
	
	
	
	
}
