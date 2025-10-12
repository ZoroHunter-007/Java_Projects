package com.TestHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="trans")

public class Transaction {

	@Id
	private int t_id;
	
	@Column
	private String t_type;
	
	@Column
	private double t_amount;
	
	@OneToOne(mappedBy = "transa")
	private Bank bank;
	
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_type() {
		return t_type;
	}
	public void setT_type(String t_type) {
		this.t_type = t_type;
	}
	public double getT_amount() {
		return t_amount;
	}
	public void setT_amount(double t_amount) {
		this.t_amount = t_amount;
	}
	
}
