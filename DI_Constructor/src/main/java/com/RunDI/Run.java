package com.RunDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Department;

public class Run {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	Department d=(Department)context.getBean("department");
	
	System.out.println("Department ID:"+d.getDept_id());
	System.out.println("\nEmployee Details:");
	d.EmployeeData();
	}
}
