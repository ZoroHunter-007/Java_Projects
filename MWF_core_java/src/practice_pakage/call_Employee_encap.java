package practice_pakage;

import java.util.Scanner;

public class call_Employee_encap {

	public static void main(String[] args) {
		Employee_encap e=new Employee_encap();
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee ID:");
		int rno=sc.nextInt();
		System.out.println("Employee Name:");
		String name=sc.next();
		System.out.println("Employee Department:");
		String department=sc.next();
		System.out.println("Employee Salary:");
		double sal=sc.nextDouble();
		
		e.setEmp_id(rno);
		e.setE_name(name);
		e.setE_department(department);
		e.setSal(sal);
		System.out.println("Employee ID:"+e.getEmp_id());
		System.out.println("Employee Name:"+e.getE_name());
		System.out.println("Employee Department:"+e.getE_department());
		System.out.println("Employee Salary:"+e.getSal());
	}
}
