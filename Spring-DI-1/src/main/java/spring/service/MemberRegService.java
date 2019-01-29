package spring.service;

import spring.dao.MemberDao;

public class MemberRegService {
	
	// DI 패턴
	
	//MemberDao dao = new MemberDao();
	
	MemberDao dao;
	
	// 생성자를 통한 객체 주입
	public MemberRegService(MemberDao dao) {
		this.dao = dao ;
	}
	
	
	public void regMember() {
		System.out.println("RegService : regMember");
		
		dao.insert();
	}

	
	
	
	
	
	
}
