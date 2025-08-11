package Enacapsulation;
public class encap_3 {

	public static void main(String[] args) throws NumberException {
		// TODO Auto-generated method stub
		
		Student s=new Student();
		int marks[]= {99,97,98}; 
		s.setName("Dhruv");
		s.setRno(45);
		
		s.setMarks(marks);
		System.out.println("Student Name:" +s.getName());
		System.out.println("Student RollNo: "+ s.getRno());
		s.printMarks();
		
		System.out.println("Avg is: "+s.calcAvg());
		System.out.println("grade is: "+s.Grade());
		
		
		
	}

}
