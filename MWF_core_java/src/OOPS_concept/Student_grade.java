package OOPS_concept;
import java.util.Scanner;
public class Student_grade {

	int marks[] = new int[5];
	int tot=0;
	float per=0;
	void stud_info(int marks[])
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter marks for subject " + (i+1) + ":");
			marks[i] = sc.nextInt();
		}
		
	}
	void Result(int marks[]) {
		for(int i=0;i<5;i++) {
			tot += marks[i];
		}
		per = tot / 5;
		System.out.println("Total Marks: " + tot);
		System.out.println("Percentage: " + per + "%");
	}
	
	void grade(float per) {
		if(per>=90)
		{
			System.out.println("Grade: A+");
		}
		else if(per>=80 && per<90)
		{
			System.out.println("Grade: A");
		}
		else if(per>=70 && per<80)
		{
			System.out.println("Grade: B+");
		}
		else if(per>=60 && per<70)
		{
			System.out.println("Grade: B");
		}
		else if(per>=50 && per<60)
		{
			System.out.println("Grade: C");
		}
		else if(per>=40 && per<50)
		{
			System.out.println("Grade: D+");
		}
		else
		{
			System.out.println("Fail..!");
		}
	}
	
	public static void main(String[] args) {
		Student_grade sg=new Student_grade();
		Scanner sc = new Scanner(System.in);
		sg.stud_info(sg.marks); // Collecting student marks
		sg.Result(sg.marks); // Calculating total and percentage
		sg.grade(sg.per); // Determining the grade based on percentage
		
	}

}
