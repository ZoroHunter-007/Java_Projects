package com.example.SpringBootBankApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/ShowCustomer")
	public ResponseEntity<List<Customer>> ShowAllCustomer(){
		return ResponseEntity.ok(serviceClass.ShowAllData());
	}
	
	@GetMapping("/ShowCustomer/{id}")
	public ResponseEntity<Customer>getDataById(@PathVariable int id){
	
		Customer cust=serviceClass.fetchById(id);
		if(cust!=null) {
			return ResponseEntity.ok(cust);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PutMapping("/UpdateCustomer/{id}")
	public ResponseEntity<Customer>updateCustomer(@RequestBody Customer cust,@PathVariable int id){
		Customer customer=serviceClass.updateCustomer(id, cust);
		if(customer!=null) {
			return ResponseEntity.ok(customer);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
}
