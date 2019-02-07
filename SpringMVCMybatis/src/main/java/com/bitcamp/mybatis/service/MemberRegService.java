package com.bitcamp.mybatis.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bitcamp.mybatis.dao.MemberMybatisDao;
import com.bitcamp.mybatis.model.Member;

@Service
public class MemberRegService {

	@Inject
	private MemberMybatisDao dao;
	
	public int memberReg(Member member) {
		
		return dao.inserMember(member);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
