package com.example.SpringbootEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;
	
	@PostMapping("/sendMail")
	public String sendMail(@RequestBody UserMail mail) {
		String status=emailService.sendSimpleEmail(mail);
		return status;
	}
	
}
