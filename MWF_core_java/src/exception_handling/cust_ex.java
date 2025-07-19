package exception_handling;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class cust_ex {

	Scanner sc = new Scanner(System.in);
	int rno;
	int age;
	String name;
	public cust_ex() throws InvalidAgeException {
		System.out.println("Enter Roll No: ");
		rno = sc.nextInt();
		System.out.println("Enter Name: ");
		name = sc.next();
		System.out.println("Enter Age: ");
		age = sc.nextInt();
		
		if(age<18) {
			throw new InvalidAgeException("Age must be 18 or above.");
		}
		else
		{
			System.out.println("Roll No: " + rno);
			System.out.println("Name: " + name);
			System.out.println("Age is valid: " + age);
		}
	}
	
	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		cust_ex ce=new cust_ex();

	}

}
