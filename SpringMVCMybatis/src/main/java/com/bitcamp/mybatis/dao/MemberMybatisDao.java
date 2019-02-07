package com.bitcamp.mybatis.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.bitcamp.mybatis.model.Member;

@Repository
public class MemberMybatisDao {

	@Inject
	private SqlSessionTemplate sqlSession;

	private String namespace = "com.bitcamp.mybatis.mapper.mybatis.memberMapper";

	
	
	public int inserMember(Member member) {			
		return sqlSession.update(namespace+".insertMember", member);
	}

	public Member selectById(String email) {
		return sqlSession.selectOne(namespace+".selectById", email);
	}

	public List<Member> selectList() {
		return sqlSession.selectList(namespace+".selectList");
	}
	
	
	
	
	
	
	
	
	
}
