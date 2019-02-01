package com.bitcamp.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.app.dao.MemberDao;

@Service
public class MemberRegService {

	@Autowired
	private MemberDao dao;
	
	public int inserMember() {
		return dao.insertMember();
	}
}
