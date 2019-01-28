import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import spring.service.MemberPwChangeService;
import spring.service.MemberRegService;

public class SpringMain {
	
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		
		// 컨테이너 생성
		ctx = new GenericXmlApplicationContext("classpath:appCtx.xml");
		
		MemberRegService regService = 
				ctx.getBean("regService", MemberRegService.class);
		
		System.out.println("메인메서드에서 입력 처리");
		regService.regMember();
		
		
		
		MemberPwChangeService changeService = 
				ctx.getBean("changeService", MemberPwChangeService.class);
		
		System.out.println("메인메서드에서 수정 처리");
		changeService.change();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
