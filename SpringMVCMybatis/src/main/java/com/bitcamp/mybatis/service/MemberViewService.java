package com.bitcamp.mybatis.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.bitcamp.mybatis.dao.MemberMybatisDao;
import com.bitcamp.mybatis.model.Member;

@Service
public class MemberViewService {

	@Inject
	private MemberMybatisDao dao;
	
	
	
	public Member selectById(String email) {
		
		return dao.selectById(email);		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
