package com.bitcamp.mail;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MailSenderController {
	
	@Inject
	private MailSendService mailService;

	@RequestMapping("/mail/mailsend")
	public String mailSend() {
		
		mailService.mailSneder("ryuyj76@naver.com");
		
		return "mail/mailsend";
	}

	@RequestMapping("/mail/simplemailsend")
	public String simpleMailSend() {
		
		mailService.simlpleMailSend("ryuyj76@naver.com", "안녕하세요");
		
		return "mail/mailsend";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
