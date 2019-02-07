package com.bitcamp.mybatis.service;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.bitcamp.mybatis.dao.MemberDao;
import com.bitcamp.mybatis.model.Member;

@Service
public class MemberRegService {

	//@Inject
	//private MemberMybatisDao dao;
	
	@Inject
	private SqlSessionTemplate template;
	
	private MemberDao dao;
	
	public int memberReg(Member member) {
		
		dao = template.getMapper(MemberDao.class);
		
		return dao.inserMember(member);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
