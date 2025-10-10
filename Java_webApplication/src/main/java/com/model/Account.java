package com.model;

import java.time.LocalDateTime;

public class Account {

	private int ac_id,t_id;
	private String ac_number,holder_name,ac_type,ac_no,t_type;
	private double balance,amount;
	private LocalDateTime date; 
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getAc_no() {
		return ac_no;
	}
	public void setAc_no(String ac_no) {
		this.ac_no = ac_no;
	}
	public String getT_type() {
		return t_type;
	}
	public void setT_type(String t_type) {
		this.t_type = t_type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAc_id() {
		return ac_id;
	}
	public void setAc_id(int ac_id) {
		this.ac_id = ac_id;
	}
	public String getAc_number() {
		return ac_number;
	}
	public void setAc_number(String ac_number) {
		this.ac_number = ac_number;
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
	
}
