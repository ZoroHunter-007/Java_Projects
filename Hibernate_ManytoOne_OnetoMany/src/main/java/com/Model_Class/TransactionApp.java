package com.Model_Class;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Transaction")

public class TransactionApp {

	@Id
	@GeneratedValue
	private int T_ID;
	
	@Column
	private String T_Type;
	
	@Column
	private Double Amount;
	
	@OneToMany(mappedBy = "TApp",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<BankApp>bApp;
	
	
	public List<BankApp> getbApp() {
		return bApp;
	}
	public void setbApp(List<BankApp> bApp) {
		this.bApp = bApp;
	}
	public int getT_ID() {
		return T_ID;
	}
	public void setT_ID(int t_ID) {
		T_ID = t_ID;
	}
	public String getT_Type() {
		return T_Type;
	}
	public void setT_Type(String t_Type) {
		T_Type = t_Type;
	}
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		Amount = amount;
	}
	
	
}
