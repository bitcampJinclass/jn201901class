package com.bitcamp.mail;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailSendService {
	
	@Autowired
	private MailSender mailSender;
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	
	public void mailSneder(String to) {
		
		MimeMessage message = javaMailSender.createMimeMessage();
		
		try {
			
			// 제목설정
			message.setSubject("안녕하세요 고객님 핵 이득 들어와", "utf-8");
			
			// 받는 이메일 설정
			message.addRecipient(
					RecipientType.TO, 
					new InternetAddress(to));
			
			// 내용 설정
			String HtmlMsg = "<h1>안녕하세요</h1> <a href=\"http://localhost/mail/\">서비스 보기</a>";
			message.setText(HtmlMsg, "utf-8", "html");
			
			
			javaMailSender.send(message);
			
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}
	
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
