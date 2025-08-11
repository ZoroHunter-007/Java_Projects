package Enacapsulation;
class NumberException extends Exception{
	public NumberException(String message) {
		super(message);
	}
}
public class Student {

	private String name;
	private int rno;
	private int marks[]=new int[3];
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks)throws NumberException {
		if(marks.length!=3)
		{
			throw new NumberException("Enter only 3 Subject...!");
		}
		else
		{
			this.marks=marks;
		}
	}
	public void printMarks() {
		System.out.println("Marks :");
		for(int mark:marks) {
			System.out.println(mark);
		}
	}
	
	public double calcAvg(){
		
		int sum=0;
		for(int mark:marks)
			sum+=mark;
		double avg= sum/3.0;
		//System.out.println("Average is: " +avg);
		return avg;
		
}
	public char Grade() {
		double avg=calcAvg();
		if(avg>=90) 
		{
			//System.out.println("Grade:A");
		return 'A';
		}
		else if(avg>=75) 
		{
			//System.out.println("Grade:A");
		return 'A';
		}
		else if(avg>=60) 
		{
			//System.out.println("Grade:A");
		return 'A';
		}
		else {
			//System.out.println("Grade:D");
			return 'D';
		}
		
			
	}
	
}
