package practice_pakage;

import java.util.Scanner;

public class call_marks_encap {

	public static void main(String[] args) throws NumberException {
		Scanner sc=new Scanner(System.in);
		int rno;
		String name;
		int marks[]=new int[3];
		System.out.println("Enter Student Roll No:");
		rno=sc.nextInt();
		System.out.println("Enter Student Name:");
		name=sc.next();
		System.out.println("Enter Student Marks:");
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
			
		}
		marks_encap me=new marks_encap(rno, name, marks);
		me.setRno(rno);
		me.setName(name);
		me.setMarks(marks);
		System.out.println("Student Roll No:"+me.getRno());
		System.out.println("Studnet Name:"+me.getName());
		me.printMarks();
		me.marks_verification(marks);
		System.out.println("Avrage is:"+me.Callavg());
		System.out.println("Garde is:"+me.grade());
		
	}
}
