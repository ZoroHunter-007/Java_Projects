package com.example.SpringNestedJSON;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class CustomerEntity {

	@Id
	@GeneratedValue
	private int custId;
	
	@Column
	private String custName;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "customerEntity")
	private List<OrderEntity> orderEntity;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public List<OrderEntity> getOrderEntity() {
		return orderEntity;
	}
	public void setOrderEntity(List<OrderEntity> orderEntity) {
		this.orderEntity = orderEntity;
		
		if(orderEntity!=null) {
			orderEntity.forEach(order -> order.setCustomerEntity(this));
		}
	}
	
}
