package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Stud implements Serializable{
	int id;
	String name;
	String department;
	int salary;
	public Stud(int id,String name,String department,int salary) {
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
}
public class serialization_emp {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Stud s=new Stud(45,"Dhruv","FullStcakDev",50000);
		/*FileOutputStream fos=new FileOutputStream("employee.txt");
		ObjectOutputStream o=new ObjectOutputStream(fos);
		o.writeObject(s);
		*/
		
		FileInputStream fin=new FileInputStream("employee.txt");
		ObjectInputStream os=new ObjectInputStream(fin);
		Stud stud=(Stud) os.readObject();
		System.out.println("ID: " + s.id +" Name: " + s.name + " Department: " + s.department + " Salary: " +s.salary);
		
	}

}

