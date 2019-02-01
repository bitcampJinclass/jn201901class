package com.bitcamp.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.app.dao.MemberDao;
import com.bitcamp.app.model.Member;

@Service
public class MemberSelectService {

	@Autowired
	MemberDao dao;
	
	public Member selectByEmail(String email) {
		
		return dao.selectByEmail(email);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
