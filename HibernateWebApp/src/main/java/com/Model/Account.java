package com.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="acc")

public class Account {

	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto Increment
	    @Column(name="ac_no")
	    private long ac_no;

	    @Column(nullable = false)
	    private double balance; // ✅ Default balance

	    @Column(nullable = false)
	    private String ac_type ; // ✅ Default account type

	    @Column(name="holder_name")
	    private String holder_name;

	    @OneToOne(mappedBy = "acc", cascade = CascadeType.ALL)
	    private Register_Cust rc;
	 public Account() {
	        this.ac_type = "Savings";
	        this.balance = 500.0;
	    }
	 
	
	public long getAc_no() {
		return ac_no;
	}
	public void setAc_no(long ac_no) {
		this.ac_no = ac_no;
	}
	
	public Register_Cust getRc() {
		return rc;
	}
	public void setRc(Register_Cust rc) {
		this.rc = rc;
	}
	
	public String getHolder_name() {
		return holder_name;
	}
	public void setHolder_name(String holder_name) {
		this.holder_name = holder_name;
	}
	public String getAc_type() {
		return ac_type;
	}
	public void setAc_type(String ac_type) {
		this.ac_type = ac_type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
