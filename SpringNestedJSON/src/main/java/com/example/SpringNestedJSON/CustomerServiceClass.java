package com.example.SpringNestedJSON;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceClass {

	@Autowired
	private CustomerRepo customerRepo;
	
	public CustomerEntity saveCustomer(CustomerEntity entity) {
		entity.getOrderEntity().forEach(order -> order.setCustomerEntity(entity));
		return customerRepo.save(entity);
		
	}
	
	//fetch all Customers with orders
	public Iterable<CustomerEntity> fetchAllCustomers(){
		return customerRepo.findAll();
	}
	
	
	
}
