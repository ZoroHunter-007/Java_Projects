package practice_pakage;

import java.util.Scanner;

public class call_Class {

	public static void main(String[] args) {
		encapsulation_class e=new encapsulation_class();
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the ID:");
		int id=sc.nextInt();
		System.out.println("Enter the Name:");
		String name=sc.next();
		System.out.println("Enter the Phone No:");
		long  p_no=sc.nextLong();
		System.out.println("Ehter the Address:");
		String add=sc.next();
		
		e.setId(id);
		e.setName(name);
		e.setP_no(p_no);
		e.setAddress(add);
		System.out.println("ID is:"+e.getId());
		System.out.println("Name is:"+e.getName());
		System.out.println("Phone No is:"+e.getP_no());
		System.out.println("Address is:"+e.getAddress());
	}
}
