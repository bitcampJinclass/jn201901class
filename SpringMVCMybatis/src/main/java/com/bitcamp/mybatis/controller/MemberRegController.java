package com.bitcamp.mybatis.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.mybatis.model.Member;
import com.bitcamp.mybatis.service.MemberRegService;
import com.bitcamp.mybatis.service.MemberViewService;

@Controller
public class MemberRegController {
	
	@Inject
	private MemberRegService regService;
	
	@Inject
	private MemberViewService viewService;
	
	@RequestMapping("/member/list")
	public String selectList(Model model) {
		
		List<Member> members = viewService.selectList();
		
		model.addAttribute("members", members);
		
		return "member/list";
	}
	
	
	@RequestMapping("member/view")
	public String selectById(Model model) {
		
		
		Member member = viewService.selectById("hot@naver.com");
		
		model.addAttribute("result", member);
		
		
		return "member/view";
	}
	
	
	
	
	
	@RequestMapping("/member/reg")
	public String memberReg() {
		
		Member member = new Member();
		member.setEmail("coolinhot@naver.com");
		member.setPassword("qwer");
		member.setName("영희");
		
		System.out.println(member);
		
		regService.memberReg(member);
		
		System.out.println("========================");
		
		System.out.println(member);
		
		
		
		
		
		
		
		
		
		
		
		return "member/insert";
	}

}

