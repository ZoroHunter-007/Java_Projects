package OOPS_concept;
import java.util.Scanner;

 class Student{
	Scanner sc = new Scanner(System.in);
	String name;
	int rno;
	int marks[]=new int[5];
	void stud_info() {
		System.out.println("Enter the name:");
		name = sc.next();
		System.out.println("Enter the roll number:");
		rno = sc.nextInt();
		for(int i=0;i<5;i++) {
			System.out.println("Enter marks for subject " + (i+1) + ":");
			marks[i] = sc.nextInt();
		}
	}
}
 class Result extends Student{
	int total;
	float percentage;
	
	void Result() {
		total = 0;
		for(int i=0;i<5;i++) {
			total += marks[i];
		}
		percentage = (float)total / 5;
	}
	
 }
 class Display extends Result{
	 void Display()
	 {
		 System.out.println("Name: " + name);
		 System.out.println("Roll Number: " + rno);
		 System.out.println("Total Marks: " + total);
		 System.out.println("Percentage: " + percentage + "%");
	 }	
 }
public class Main1 {

	public static void main(String[] args) {
		Display d=new Display();
		d.stud_info(); // Collecting student information
		d.Result(); // Calculating total and percentage
		d.Display(); // Displaying the student information, total marks, and percentage

	}

}
