package Inheritance;
import java.util.Scanner;
class Admin{
	static Scanner sc = new Scanner(System.in);
	int id[];
	String name[];
	int size;
	public Admin() {
		System.out.println("Enter the num of id and name: ");
		size = sc.nextInt();
		id = new int[size];
		name=new String[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter id: ");
			id[i] = sc.nextInt();
			System.out.println("Enter name: ");
			name[i] = sc.next();
		}
	}
	public void display() {
	    System.out.println("Admin Details:");
	    
	    for(int i=0;i<size;i++) {
	    	System.out.println("ID:"+id[i]+ " "+ "Name:"+name[i]);
	    }
	    System.out.println("\n");
	}
}
class Manager extends Admin{
	int id[];
	String name[];
	int size;
	public Manager() {
		System.out.println("Enter the num of id and name: ");
		size = sc.nextInt();
		id = new int[size];
		name=new String[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter id: ");
			id[i] = sc.nextInt();
			System.out.println("Enter name: ");
			name[i] = sc.next();
		}
	}
	public void display() {
		super.display(); // Calling the display method of Admin class
	    System.out.println("Manger Details:");
	    
	    for(int i=0;i<size;i++) {
	    	System.out.println("ID:"+id[i]+ " "+ "Name:"+name[i]);
	    }
	    System.out.println("\n");
	}
}
class Employee extends Manager{
	int id[];
	String name[];
	int size;
	public Employee() {
		System.out.println("Enter the num of id and name: ");
		size = sc.nextInt();
		id = new int[size];
		name=new String[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter id: ");
			id[i] = sc.nextInt();
			System.out.println("Enter name: ");
			name[i] = sc.next();
		}
	}
	public void display() {
		super.display(); // Calling the display method of Manager class
	    System.out.println("Employee Details:");
	    
	    for(int i=0;i<size;i++) {
	    	System.out.println("ID:"+id[i]+ " "+ "Name:"+name[i]);
	    }
	    System.out.println("\n");
	}
}
public class multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee().display(); // Creating an object of Employee and calling display method

	}

}
