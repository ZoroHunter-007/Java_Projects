package com.TestHibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bank")


public class Bank {

	@Id
	private int ac_number;
	
	@Column
	private String ac_name;
	
	@Column
	private String ac_type;
	
	@Column
	private double ac_balance;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Transaction transa;
	
	public Transaction getTransa() {
		return transa;
	}
	public void setTransa(Transaction transa) {
		this.transa = transa;
	}
	public int getAc_number() {
		return ac_number;
	}
	public void setAc_number(int ac_number) {
		this.ac_number = ac_number;
	}
	public String getAc_name() {
		return ac_name;
	}
	public void setAc_name(String ac_name) {
		this.ac_name = ac_name;
	}
	public String getAc_type() {
		return ac_type;
	}
	public void setAc_type(String ac_type) {
		this.ac_type = ac_type;
	}
	public double getAc_balance() {
		return ac_balance;
	}
	public void setAc_balance(double ac_balance) {
		this.ac_balance = ac_balance;
	}
	
}
