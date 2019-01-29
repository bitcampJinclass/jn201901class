package spring.service;

import spring.dao.MemberDao;

public class MemberPwChangeService {
	
	MemberDao dao;

	public void setDao(MemberDao dao) {
		this.dao = dao;
	}

	
	
	
	/*
	 * public MemberPwChangeService(MemberDao dao) { this.dao = dao; }
	 */

	public void change() {
		System.out.println("changeService : change ");
		
		dao.change();
	}

	
	
	
	
	
	
	
	
	
	
}
