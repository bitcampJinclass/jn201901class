package com.bitcamp.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.bitcamp.app.model.Member;

@Repository
public class MemberDao {

	@Autowired
	private JdbcTemplate template;

	public int insertMember() {

		String sql = "insert into member " 
					+ "(email, password, name, photo)" 
					+ " value (?,?,?,?)";

		int resultCnt = template.update(sql, "ryuyj1@nate.com", "1111", "유영진", null);

		return resultCnt;

	}
	
	public int insertMemberKey(Member member) {
		
		KeyHolder keyHolder = new GeneratedKeyHolder();
		
		int resulrCnt = template.update(
				
				new PreparedStatementCreator() {
					
					@Override
					public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
						
						
						String sql = "insert into member " 
								+ "(email, password, name, photo)" 
								+ " value (?,?,?,?)";
						PreparedStatement pstmt = 
								con.prepareStatement(sql, new String[] {"id"});
						
						pstmt.setString(1, member.getEmail());
						pstmt.setString(2, member.getPassword());
						pstmt.setString(3, member.getName());
						pstmt.setString(4, member.getPhoto());
						
						return pstmt;
					}
				}
				
				, keyHolder);
		
		Number keyValue = keyHolder.getKey();
		
		member.setId(keyValue.intValue());
		
		return resulrCnt;
		
	}
	
	

	public Member selectByEmail(String email) {

		String sql = "select * from member where email=?";
		/*List<Member> results = 
				template.query(sql, new MemberRowMapper(), email);*/

		/*
		 * List<Member> results = template.query(sql,new Object[] {email},new
		 * MemberRowMapper());
		 */
		
		Member member = 
				template.queryForObject(
						sql, 
						new MemberRowMapper(), 
						email);
		

		//return results.isEmpty() ? null : results.get(0);
		return member;
	}
	
	
	
	
	
	
	
	

}
