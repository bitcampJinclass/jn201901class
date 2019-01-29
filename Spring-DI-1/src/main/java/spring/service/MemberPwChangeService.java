package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.dao.MemberDao;

public class MemberPwChangeService {
	
	@Autowired
	/* @Qualifier("main") */
	MemberDao dao;

	/*
	 * public void setDao(MemberDao dao) { this.dao = dao; }
	 */

	
	
	
	/*
	 * public MemberPwChangeService(MemberDao dao) { this.dao = dao; }
	 */

	public void change() {
		System.out.println("changeService : change ");
		
		dao.change();
	}

	
	
	
	
	
	
	
	
	
	
}
