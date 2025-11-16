package com.Phone;

import com.Person.person;

public class phone {

	private int phone_modelno;
	private String phone_name;
	private int phone_storage;
	private person person;
	
	public int getPhone_modelno() {
		return phone_modelno;
	}
	public void setPhone_modelno(int phone_modelno) {
		this.phone_modelno = phone_modelno;
	}
	public String getPhone_name() {
		return phone_name;
	}
	public void setPhone_name(String phone_name) {
		this.phone_name = phone_name;
	}
	public int getPhone_storage() {
		return phone_storage;
	}
	public void setPhone_storage(int phone_storage) {
		this.phone_storage = phone_storage;
	}
	public person getPerson() {
		return person;
	}
	public void setPerson(person person) {
		this.person = person;
	}
	
	
	public void showPersonDetails() {
		System.out.println("Person ID:"+person.getPerson_id());
		System.out.println("Person Name:"+person.getPerson_name());
		System.out.println("Person MobileNo:"+person.getPerson_mobile());
	}
}
