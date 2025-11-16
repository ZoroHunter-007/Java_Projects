package com.Department;

import com.Employee.employee;

public class department {

	private int dept_id;
	private String dept_name;
	private employee employee;
	
	public department(int dept_id,String dept_name,employee employee) {
		// TODO Auto-generated constructor stub
		this.dept_id=dept_id;
		this.dept_name=dept_name;
		this.employee=employee;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public employee getEmp() {
		return employee;
	}

	public void setEmp(employee employee) {
		this.employee = employee;
	}
	
	public void showEmployeeDetails() {
		System.out.println("Employee ID:"+employee.getEmp_id());
		System.out.println("Employee Name:"+employee.getEmp_name());
		System.out.println("Employee No:"+employee.getEmp_no());
	}
}
