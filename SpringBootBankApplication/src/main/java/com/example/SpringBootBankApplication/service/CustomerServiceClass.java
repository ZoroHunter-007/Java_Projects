package com.example.SpringBootBankApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.SpringBootBankApplication.entity.Customer;
import com.example.SpringBootBankApplication.entity.CustomerEmail;
import com.example.SpringBootBankApplication.repository.CustomerRepo;


@Service
public class CustomerServiceClass {

	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	
	 @Autowired
	    private EmailService emailService;
	 
	public Customer SaveCustomer(Customer cust) {
		String encryptPass=encoder.encode(cust.getPassword());
		cust.setPassword(encryptPass);
		Customer savedCust=customerRepo.save(cust);
		 CustomerEmail email = new CustomerEmail();
	        email.setRecipient(cust.getEmail());
	        email.setSubject("Welcome to Spring Boot Bank Application");
	        email.setMsgBody(
	            "Hello " + cust.getCustName()+ ",\n\n" +
	            "Your bank account has been successfully created.\n" +
	            "Thank you for registering with us.\n\n" +
	            "Regards,\nSpring Boot Bank"
	        );

	        // Send mail
	        emailService.sendMail(email);
	        
	        return savedCust;
		
	}
	
}
