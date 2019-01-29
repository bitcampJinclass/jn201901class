package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.dao.MemberDao;
import spring.service.MemberPwChangeService;
import spring.service.MemberRegService;

@Configuration
public class JavaConfig {
	
	
	@Bean(name="dao")
	public MemberDao getDao() {
		return new MemberDao();
	}
	
	@Bean(name="regService")
	public MemberRegService getRegService() {
		return new MemberRegService(getDao());
		//                          의존 설정
	}
	
	@Bean(name="changeService")
	public MemberPwChangeService getChangeService() {
		return new MemberPwChangeService();
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
