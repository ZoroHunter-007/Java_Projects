package OOPS_concept;
import java.util.Scanner;

 class parent{
	 Scanner sc = new Scanner(System.in);
	String name;
	int age;
	
	parent()
	{
		System.out.println("Enter the name:");
		name = sc.next();
		System.out.println("Enter the age:");
		age = sc.nextInt();
		
	}
	void info()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
 class child extends parent{
	 Scanner sc = new Scanner(System.in);
	 String sub;
	 int roll;
	 child()
	 {
		 System.out.println("Enter the subject:");
		 sub = sc.next();
		 System.out.println("Enter the roll number:");
		 roll = sc.nextInt();
	 }
	 void display()
	 {
		 System.out.println("Subject: " + sub);
		 System.out.println("Roll Number: " + roll);
	 }
	 
 }

public class main {

	public static void main(String[] args) {
		child c=new child(); // Creating an object of child class which inherits from parent class
		c.info(); // Calling the info method from parent class
		c.display();
		

	}

}
