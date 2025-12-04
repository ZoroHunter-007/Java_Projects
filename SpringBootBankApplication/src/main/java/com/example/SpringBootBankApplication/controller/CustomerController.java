package com.example.SpringBootBankApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootBankApplication.entity.Customer;
import com.example.SpringBootBankApplication.service.CustomerServiceClass;

@RestController
@RequestMapping("/api/v3/")
public class CustomerController {

	@Autowired
	private CustomerServiceClass serviceClass;
	
	@PostMapping("/Customer")
	public ResponseEntity<Customer>SaveCustData(@RequestBody Customer cust){
		Customer customer=serviceClass.SaveCustomer(cust);
		return ResponseEntity.ok(customer);
	}
}
