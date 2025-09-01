package practice_pakage;

import java.util.Scanner;

public class call_encap {

	public static void main(String[] args) {
		encap_prg e=new encap_prg();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID:");
		int id=sc.nextInt();
		System.out.println("Enter Name:");
		String name=sc.next();
		System.out.println("Enter City:");
		String city=sc.next();
		
		e.setCity(city);
		e.setId(id);
		e.setName(name);
		System.out.println("ID is:"+e.getId());
		System.out.println("Name is:"+e.getName());
		System.out.println("City is:"+e.getCity());
	}
}
