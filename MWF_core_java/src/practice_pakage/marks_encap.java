package practice_pakage;
class NumberException extends Exception{
	public NumberException(String message) {
		super(message);
	}
}

public class marks_encap {

	private int rno;
	private String name;
	private int marks[];
	public marks_encap(int rno,String name,int marks[]) {
		this.rno=rno;
		this.name=name;
		this.marks=marks;
		
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public void marks_verification(int marks[]) throws NumberException{
		if(marks.length!=3) {
			throw new NumberException("Only 3 Subject enter....!");
		}
		else {
				this.marks=marks;
		}
	}
	public void printMarks()
	{
		System.out.println("Student Marks:");
		for(int mark:marks) {
			System.out.println(mark);
		}
	}
	public double Callavg() {
		int tot=0;
		for(int i:marks) {
			tot+=i;		
		}
		double avrage=tot/3.0;
		
		return avrage;
	}
	public char grade() {
		double avg1=Callavg();
		if(avg1>=90) {
			return 'A';
		}
		else if(avg1>=80) {
			return 'B';
		}
		else if(avg1>=70) {
			return 'C';
		}
		else {
		return 'D';
		}
	}
	
}
