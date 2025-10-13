package com.RunClass;

import java.util.ArrayList;

import com.DaoClass.Dao_methods;
import com.Model.Department;
import com.Model.Employee;

public class RunDepartment {

	public static void main(String[] args) {
		
		
		Department d=new Department();
		//d.setDept_name("IT");
		d.setDept_name("HR");
		
		Employee e=new Employee();
		//first Employee
		e.setEmp_name("Dhruv");
		e.setEmp_sal(80000.00);
		e.setDept(d);
		
		//second Employee
		Employee e1=new Employee();
		e1.setEmp_name("Jay");
		e1.setEmp_sal(90000.00);
		e1.setDept(d);
		
		ArrayList<Employee>al=new ArrayList<Employee>();
		
		al.add(e);
		al.add(e1);
		d.setEmp(al);
		
		Dao_methods dm=new Dao_methods();
	/*dm.SaveDepartment(d);
		System.out.println("Data Save Successfully....");*/
		
	/*	dm.ShowAllData("HR").forEach(i->{
			System.out.println("Department Name: "+i.getDept_name());
			i.getEmp().forEach(j->{
				System.out.println("Employee Name: "+j.getEmp_name()+" Employee Salary: "+j.getEmp_sal());
			});
			System.out.println("\n");
		});*/
		
		d=dm.FetchAllData(2);
		System.out.println("Department Name: "+d.getDept_name());
		d.getEmp().forEach(i->{
			System.out.println("Employee Name:"+i.getEmp_name()+" "+"Employee Salary:"+i.getEmp_sal());
		});
		
		
	}
}
