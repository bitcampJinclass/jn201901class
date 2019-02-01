package com.bitcamp.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bitcamp.app.model.Member;

public class MemberRowMapper implements RowMapper<Member> {

	@Override
	public Member mapRow(ResultSet rs, int rowNum) throws SQLException {

		Member member = new Member();
		member.setId(rs.getInt("id"));
		member.setEmail(rs.getString("email"));
		member.setName(rs.getString("name"));
		member.setPassword(rs.getString("password"));
		member.setPhoto(rs.getString("photo"));

		return member;
	}

}
