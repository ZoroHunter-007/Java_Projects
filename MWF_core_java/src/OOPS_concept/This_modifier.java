package OOPS_concept;
import java.util.Scanner;
public class This_modifier {

	int a;
	String name;

	This_modifier(int a, String name) {
		this.a=a;
		this.name=name;
	}

	void display() {
		System.out.println("a: " + this.a + ", name: " + this.name);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer value for a:");
		int a =sc.nextInt(); // Taking integer input for a
		System.out.println("Enter a string value for name:");
		String name=sc.next(); // Taking string input for name
		This_modifier obj = new This_modifier(a,name);
		obj.display(); // Displaying the values of a and name

	}

}
