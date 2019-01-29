import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import spring.service.MemberPwChangeService;
import spring.service.MemberRegService;

public class SpringMain {

	private static ApplicationContext ctx;

	public static void main(String[] args) {

		String[] path = { "classpath:appCtx.xml", "classpath:appCtx2.xml" };
		
		// 컨테이너 생성
		ctx = new GenericXmlApplicationContext("classpath:appCtx.xml");

		MemberRegService regService = ctx.getBean("regService", MemberRegService.class);

		System.out.println("메인메서드에서 입력 처리");
		regService.regMember();

		MemberPwChangeService changeService = ctx.getBean("changeService", MemberPwChangeService.class);

		System.out.println("메인메서드에서 수정 처리");
		changeService.change();
		
		
		MemberRegService regService1 = ctx.getBean("regService", MemberRegService.class);
		MemberRegService regService2 = ctx.getBean("regService", MemberRegService.class);
		
		System.out.println("====================================");
		
		System.out.println("regService1 == regService2 ::  " + (regService1==regService2));
		

		MemberPwChangeService service3 = ctx.getBean("changeService1", MemberPwChangeService.class);
		MemberPwChangeService service4 = ctx.getBean("changeService1", MemberPwChangeService.class);
		
		System.out.println("====================================");
		
		System.out.println("Service3 == Service4 ::  " + (service3==service4));
		
		

	}

	
	
	
	
	
	
	
	
	
	
}
