package com.bitcamp.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.app.dao.MemberDao;
import com.bitcamp.app.model.Member;

@Service
public class MemberRegService {

	@Autowired
	private MemberDao dao;
	
	public int inserMember() {
		return dao.insertMember();
	}
	

	public int insertMemberKey(Member member) {
		return dao.insertMemberKey(member);
	}
	
	
	
	
	
	
	
	
	
}
