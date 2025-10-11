package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="student")

public class Student {

	
	
	@Id
	private int rollno;
	
	@Column
	private String std_name;
	
	@Column
	private String std_email;
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	//one to one mapping
	//fetch type is EAGER means when we fetch student data then subject data will also be fetched
	//fetch type is LAZY means when we fetch student data then subject data will not be fetched
	//cascade type is ALL means when we perform any operation on student then the same operation will be performed on subject
	@JoinColumn(name="sub_id")//foreign key column name
	
	private Subject subject;//passing subject class reference
	
	
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getStd_email() {
		return std_email;
	}
	public void setStd_email(String std_email) {
		this.std_email = std_email;
	}
	
}
