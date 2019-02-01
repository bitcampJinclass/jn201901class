package com.bitcamp.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
	
	@Autowired
	private JdbcTemplate template;
	
	
	public int insertMember() {
		
		String sql = "insert into member "
				   + "(email, password, name, photo)"
				    +" value (?,?,?,?)";
		
		int resultCnt = template.update(
				sql, 
				"ryuyj1@nate.com", 
				"1111", 
				"유영진", 
				null );
		
		return resultCnt;
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
