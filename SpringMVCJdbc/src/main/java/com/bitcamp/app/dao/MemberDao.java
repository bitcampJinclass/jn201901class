package com.bitcamp.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bitcamp.app.model.Member;

@Repository
public class MemberDao {

	@Autowired
	private JdbcTemplate template;

	public int insertMember() {

		String sql = "insert into member " + "(email, password, name, photo)" + " value (?,?,?,?)";

		int resultCnt = template.update(sql, "ryuyj1@nate.com", "1111", "유영진", null);

		return resultCnt;

	}

	public Member selectByEmail(String email) {

		String sql = "select * from member where email=?";
		List<Member> results = 
				template.query(sql, new MemberRowMapper(), email);

		/*
		 * List<Member> results = template.query(sql,new Object[] {email},new
		 * MemberRowMapper());
		 */

		return results.isEmpty() ? null : results.get(0);
	}

}
