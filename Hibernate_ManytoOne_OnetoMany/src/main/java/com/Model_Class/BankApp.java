package com.Model_Class;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bank_app")

public class BankApp {

	@Id
	private int Ac_Number;
	
	@Column
	private String Ac_holdername;
	
	@Column
	private String Ac_Type;
	
	@Column
	private double Ac_Balance;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="T_ID")
	private TransactionApp TApp;
	
	public TransactionApp getTApp() {
		return TApp;
	}
	public void setTApp(TransactionApp tApp) {
		TApp = tApp;
	}
	public int getAc_Number() {
		return Ac_Number;
	}
	public void setAc_Number(int ac_Number) {
		Ac_Number = ac_Number;
	}
	public String getAc_holdername() {
		return Ac_holdername;
	}
	public void setAc_holdername(String ac_holdername) {
		Ac_holdername = ac_holdername;
	}
	public String getAc_Type() {
		return Ac_Type;
	}
	public void setAc_Type(String ac_Type) {
		Ac_Type = ac_Type;
	}
	public double getAc_Balance() {
		return Ac_Balance;
	}
	public void setAc_Balance(double ac_Balance) {
		Ac_Balance = ac_Balance;
	}
	
	
}
