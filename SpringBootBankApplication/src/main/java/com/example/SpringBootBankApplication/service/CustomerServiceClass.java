package com.example.SpringBootBankApplication.service;

import java.util.List;

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
	
	public List<Customer> ShowAllData() {
		return customerRepo.findAll();
	}
	
	public Customer fetchById(int id) {
		return customerRepo.findById(id).orElse(null);
	}
	
	public Customer updateCustomer(int custId, Customer newCustData) {
	    Customer old = customerRepo.findById(custId)
	        .orElseThrow(() -> new RuntimeException("Customer not found"));

	    boolean emailChanged = !old.getEmail().equals(newCustData.getEmail());
	    boolean passwordChanged = !newCustData.getPassword().equals(old.getPassword());
	    
	    old.setCustName(newCustData.getCustName());
	    old.setEmail(newCustData.getEmail());
	    old.setPhone(newCustData.getPhone());
	    old.setAddress(newCustData.getAddress());
	    old.setDob(newCustData.getDob());

	    // Encrypt password again if changed
	    old.setPassword(encoder.encode(newCustData.getPassword()));

	    if (passwordChanged) {
	        old.setPassword(encoder.encode(newCustData.getPassword()));
	    }
	    Customer updated = customerRepo.save(old);
	    
	   
	    if (emailChanged) {
	        CustomerEmail email = new CustomerEmail();
	        email.setRecipient(updated.getEmail());  // new email
	        email.setSubject("Email Updated Successfully");
	        email.setMsgBody(
	            "Hello " + updated.getCustName() + ",\n\n" +
	            "Your registered email has been successfully updated in our system.\n" +
	            "If you did not request this change, please contact bank support immediately.\n\n" +
	            "Regards,\nSpring Boot Bank"
	        );
	        emailService.sendMail(email);
	    }

	    return updated;
	}

}
