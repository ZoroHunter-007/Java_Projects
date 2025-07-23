package Enacapsulation;
import java.util.Scanner;
public class encap_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		int marks[]=new int[3]; 
		s.setName("Dhruv");
		s.setRno(45);
		System.out.println("Enter marks:");
		for(int i=0;i<3;i++)
		{
			marks[i]=sc.nextInt();
		}
		s.setMarks(marks);
		System.out.println("Student Name:" +s.getName());
		System.out.println("Student RollNo: "+ s.getRno());
		s.printMarks();
		
		s.calcAvg();
		s.Grade();
		
		
		
	}

}
