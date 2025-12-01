package com.example.SpringbootEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceClass implements EmailService{

	@Autowired
	private JavaMailSender javaMailSender;
	
	@Value("${spring.mail.username}")
	private String sender;
	
	
	

	@Override
	public String sendSimpleEmail(UserMail details) {
		// TODO Auto-generated method stub
		SimpleMailMessage mailMessage=new SimpleMailMessage();
		mailMessage.setFrom(sender);
		mailMessage.setTo(details.getRecipient());
		mailMessage.setSubject(details.getSubject());
		mailMessage.setText(details.getMsgBody());
		javaMailSender.send(mailMessage);
		return "Mail Sent Successfully...";
	}

}
