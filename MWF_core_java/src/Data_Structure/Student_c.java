package Data_Structure;
//Enter Student data and display it using ArrayList and Iterator manually
import java.util.ArrayList;
import java.util.Scanner;

public class Student_c {

	int id;
	String name;
	public Student_c(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student_c> al = new ArrayList<Student_c>();// Create an ArrayList to store Student_c objects
		Scanner sc = new Scanner(System.in);
		int c=0;
		do {
			System.out.println("1. Enter Student Data");
			System.out.println("2. Display Student Data");
			System.out.println("3. Exit");
			System.out.println("Enter your choice(1-3):");
			int op= sc.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("Enter total number of Students:");
				int size=sc.nextInt();
				for(int i=0;i<size;i++) {
				System.out.println("\nStudent Data:");
				System.out.println("Enter Student ID:");
				int id=sc.nextInt();
				System.out.println("Enter Student Name:");
				String name=sc.next();
				
				Student_c s=new Student_c(id,name);
				al.add(s); // Add the Student_c object to the ArrayList
				}
				
			break;
			
			case 2:
				for(Student_c s1: al) {
					System.out.println("Student ID: " + s1.id +" Student Name: " + s1.name);
					
				}
				break;
				
			case 3:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice! Please enter a valid option (1-3).");
				break;
				
			}System.out.println("Do you want to continue? (1 for Yes, 0 for No):");
			c= sc.nextInt();
			
		}while(c==1);
		
	}

}
