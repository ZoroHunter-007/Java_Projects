package com.example.SpringNestedJSON;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerServiceClass serviceClass;
	
	@PostMapping("/customer")
	public ResponseEntity<CustomerEntity>SaveCutomer(@RequestBody CustomerEntity entity){
		CustomerEntity customerEntity=serviceClass.saveCustomer(entity);
		return ResponseEntity.ok(customerEntity);
	}
}
