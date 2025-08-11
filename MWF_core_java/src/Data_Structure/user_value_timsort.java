package Data_Structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class User implements Comparable<User>{
	
	int id;
	String name;
	public User(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return Integer.compare(id, o.id);
	}
}
class Student extends User{

	int marks;
	
	public Student(int id, String name,int marks) {
		super(id, name);
		this.marks=marks;
		// TODO Auto-generated constructor stub
	}
	
}

public class user_value_timsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of users:");
		int size=sc.nextInt();
		ArrayList<Student> al = new ArrayList<Student>();
		for(int i=0;i<size;i++) {
			System.out.println("Enter user id and name and marks:");
			int id=sc.nextInt();
			String name=sc.next();
			int marks=sc.nextInt();
			al.add(new Student(id,name,marks));
			
		}
		System.out.println("\nBefore sorting:");
		for(Student u:al) {
			System.out.println(u.id + " " +u.name + " "+ u.marks); 
		}
		Collections.sort(al);
		System.out.println("\nAfter Sorting:");
		for(Student u:al) {
			System.out.println(u.id + " " +u.name+ " " +u.marks);
		}
		
	}

}
