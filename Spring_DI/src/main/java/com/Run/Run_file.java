package com.Run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Department.department;
import com.Phone.phone;

public class Run_file {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		phone p=(phone) context.getBean("phone");
		System.out.println("Phone ModelNo:"+p.getPhone_modelno()+"  "+" Phone Name:"+p.getPhone_name()+"  "+" Phone Storage:"+p.getPhone_storage());
		p.showPersonDetails();
		
		System.out.println("\n");
		department d=(department)context.getBean("department");
		System.out.println("Department ID:"+d.getDept_id()+"  "+" Department Name:"+d.getDept_name());
		d.showEmployeeDetails();
	}
}
