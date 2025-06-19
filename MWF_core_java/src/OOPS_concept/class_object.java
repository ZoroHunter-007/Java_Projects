package OOPS_concept;
import java.util.Scanner;
public class class_object {

	class_object() {
		// Constructor
		System.out.println("This is a constructor of class_object");
	}
	class_object(int a)
	{
		// Overloaded constructor
		System.out.println("Value of a is: " + a);
	}
	class_object(String s)
	{
		// Overloaded constructor with string parameter
		System.out.println("String value is: " + s);
	}
	void display() {
		// Method to display a message
		System.out.println("This is a method of class_object");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		class_object obj = new class_object(); // Creating an object of class_object
		System.out.println("Object created successfully!");
		int a;
		System.out.println("Enter value of a:");
		a=sc.nextInt();
		class_object obj1 = new class_object(a); // Creating an object with parameter
		System.out.println("Enter a string:");
		String str = sc.next();
		class_object obj2 = new class_object(str); // Creating an object with string parameter
		class_object obj3 = new class_object(); // Creating another object
		obj3.display(); // Calling the display method of class_object
	}

}
