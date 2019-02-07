package com.bitcamp.mybatis.service;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.bitcamp.mybatis.dao.MemberDao;
import com.bitcamp.mybatis.model.Member;

@Service
public class MemberViewService {

	//@Inject
	//private MemberMybatisDao dao;
	
	@Inject
	private SqlSessionTemplate template;
	
	private MemberDao dao;
	
	
	
	public Member selectById(String email) {
		
		dao = template.getMapper(MemberDao.class);
		
		return dao.selectById(email);		
	}
	
	public List<Member> selectList(){
		dao = template.getMapper(MemberDao.class);
		return dao.selectList();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
