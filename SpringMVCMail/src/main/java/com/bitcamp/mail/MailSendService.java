package com.bitcamp.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class MailSendService {
	
	@Autowired
	private MailSender mailSender;
	
	public void simlpleMailSend(String to, String msg) {
		
		// 메일 내용 설정
		SimpleMailMessage simpleMessage = new SimpleMailMessage();
		simpleMessage.setSubject("[공지] 테스트 메일 발송");
		simpleMessage.setText(msg);
		simpleMessage.setTo(to);
		simpleMessage.setFrom("test@test.com");
		
		// 메일 발송
		mailSender.send(simpleMessage);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
