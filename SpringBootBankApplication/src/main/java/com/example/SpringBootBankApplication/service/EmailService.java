package com.example.SpringBootBankApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.SpringBootBankApplication.entity.CustomerEmail;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String sender;

    public String sendMail(CustomerEmail custEmail) {
        try {
            SimpleMailMessage msg = new SimpleMailMessage();
            msg.setFrom(sender);
            msg.setTo(custEmail.getRecipient());
            msg.setSubject(custEmail.getSubject());
            msg.setText(custEmail.getMsgBody());

            mailSender.send(msg);
            System.out.println("Sender email being used = " + sender);

            System.out.println("Email sent to: " + custEmail.getRecipient());
            return "Email sent successfully!";
        } catch (Exception e) {
            System.out.println("Email error: " + e.getMessage());
            return "Email sending failed: " + e.getMessage();
        }
    }
}
