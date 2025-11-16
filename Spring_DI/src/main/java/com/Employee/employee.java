package com.Employee;

public class employee {

	private int emp_id;
	private String emp_name;
	private int emp_no;
	

	public employee(int emp_id,String emp_name,int emp_no) {
		// TODO Auto-generated constructor stub
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_no=emp_no;
	}


	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


	public int getEmp_no() {
		return emp_no;
	}


	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	
	
	
	
}
