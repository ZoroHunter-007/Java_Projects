package com.model;

public class Department {

	private int dept_id;
	private Employee emp;
	
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public void EmployeeData() {
		System.out.println("Employee ID:"+emp.getEmp_id());
		System.out.println("Employee Name:"+emp.getEmp_name());
		System.out.println("Employee Department:"+emp.getDepartment());
		System.out.println("Employee Salary:"+emp.getSalary());
	}
}
