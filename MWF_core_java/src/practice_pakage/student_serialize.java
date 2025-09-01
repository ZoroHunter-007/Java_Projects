package practice_pakage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class stud_1 implements Serializable{
	int rno;
	String name;
	String department;
	public stud_1(int rno,String name,String department) {
		this.rno=rno;
		this.name=name;
		this.department=department;
	}
}
public class student_serialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		stud_1 s1=new stud_1(45,"Dhruv","BCA");
		stud_1 s2=new stud_1(47, "Dhruval","BCA");
		FileOutputStream fos=new FileOutputStream("stud.txt");
		ObjectOutputStream o=new ObjectOutputStream(fos);
		o.writeObject(s1);
		o.writeObject(s2);
		
		FileInputStream fin=new FileInputStream("stud.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		
		stud_1 s=(stud_1)oin.readObject();
		stud_1 st=(stud_1)oin.readObject();
		System.out.println("\nThis is File Data:");
		
		System.out.println("Student Roll No:"+s.rno+"\tStudnet Name:"+s.name+"\tStudent Department:"+s.department);
		System.out.println("Student Roll No:"+st.rno+"\tStudnet Name:"+st.name+"\tStudent Department:"+st.department);
		
	}
}
