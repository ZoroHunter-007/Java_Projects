package com.run;

import java.util.ArrayList;

import com.Dao.DaoClass;
import com.Model.Employee;
import com.Model.Project;

public class testrun {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setEmp_name("Dhruv");
		
		Employee e1=new Employee();
		e1.setEmp_name("Darshak");
	
		Employee e2=new Employee();
		e2.setEmp_name("Ravi Bhai");

		Employee e3=new Employee();
		e3.setEmp_name("Dev");

	
		ArrayList<Employee>al=new ArrayList<Employee>();
		al.add(e);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		
		Project p=new Project();
		p.setProject_name("HibernateManytoMany");
	
		Project p1=new Project();
		p1.setProject_name("HibernateOneToMany");
		
		Project p2=new Project();
		p2.setProject_name("HibernateManytoOne");
		
		Project p3=new Project();
		p3.setProject_name("HibernateOnetoOne");
		
		ArrayList<Project>a=new ArrayList<Project>();
		a.add(p);
		a.add(p1);
		a.add(p2);
		a.add(p3);
		
		p.setEmployees(al);
		p1.setEmployees(al);
		p2.setEmployees(al);
		p3.setEmployees(al);
		
		e.setProjects(a);
		e1.setProjects(a);
		e2.setProjects(a);
		e3.setProjects(a);
		
		DaoClass d=new DaoClass();
		d.SaveData(e);
		d.SaveData(e1);
		d.SaveData(e2);
		d.SaveData(e3);
	}
}
