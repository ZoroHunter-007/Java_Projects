package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
}
public class Serialization_concept {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student student = new Student(100, "Jay Doe");
		/*FileOutputStream fos = new FileOutputStream("student.txt");
		ObjectOutputStream o= new ObjectOutputStream(fos);
		o.writeObject(student); // Serialize the student object
		*/
		FileInputStream fos = new FileInputStream("student.txt");
		ObjectInputStream o = new ObjectInputStream(fos);
		Student s= (Student) o.readObject(); // Deserialize the student object
		System.out.println("ID: " + s.id + ", Name: " + s.name);
	
	
		}

}
