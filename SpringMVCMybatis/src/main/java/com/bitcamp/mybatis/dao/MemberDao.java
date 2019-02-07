package com.bitcamp.mybatis.dao;

import java.util.List;

import com.bitcamp.mybatis.model.Member;

public interface MemberDao {
	
	// Mapper namespace
	// interface full name
	// com.bitcamp.mybatis.dao.MemberDao
	
	// Mapper id ==> 메서드의 이름 : inserMember
	public int inserMember(Member member);
	
	// id : selectById
	public Member selectById(String email);
	
	
	// id : selectList
	public List<Member> selectList();
	
	
	
	
	
	
	
	

}
