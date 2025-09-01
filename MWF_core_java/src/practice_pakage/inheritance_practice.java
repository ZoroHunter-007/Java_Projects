package practice_pakage;

import java.util.Scanner;

class student_info{
	int size;
	int rno[];
	String name[];
	String department[];
	public student_info()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total number of Students:");
		size=sc.nextInt();
		rno=new int[size];
		name=new String[size];
		department=new String[size];
		for(int i=0;i<size;i++) {
		System.out.println("Enter Student Roll No:");
		rno[i]=sc.nextInt();
		System.out.println("Enter Student Name:");
		name[i]=sc.next();
		System.out.println("Enter Student Department:");
		department[i]=sc.next();
		}
		// TODO Auto-generated constructor stub
	}
	public void info_disp() {
		for(int i=0;i<size;i++) {
			System.out.println("Student Roll No:"+rno[i]+" Studnet Name:"+name[i]+" Student Department:"+ department[i]);
		}
	}
}
class stud_marks extends student_info{

	
	int marks[];
	
	public stud_marks() {	
		Scanner sc=new Scanner(System.in);
		marks=new int[3];
		
		System.out.println("Enter Subject Marks:");
		for(int i=0;i<3;i++) {
			marks[i]=sc.nextInt();
			
		}
		
		
	}
	public void marks_disp() {
		super.info_disp();
		for(int i=0;i<3;i++) {
			System.out.println("Marks:"+marks[i]);
		}
	}
	
}
class avg_stud extends stud_marks{
	double tot[];
	double avg[];
	
}
public class inheritance_practice {

	public static void main(String[] args) {
		new stud_marks().marks_disp();
	}
}
