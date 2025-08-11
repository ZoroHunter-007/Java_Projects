package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class admin implements Serializable{
	int id;
	String name;
	String department;
	public admin(int id,String name,String department) {
		this.id=id;
		this.name=name;
		this.department=department;
		//System.out.println("Admin ID:" + this.id + " Admin Name:" + this.name +" Admin Department:" + this.department);
	}
}
class manager extends admin{
	int m_id;
	String m_name;
	String m_department;
	public manager(int m_id,String m_name,String m_department) {
		super(10,"Dhruv","Full Stack Developer");
		this.m_id=m_id;
		this.m_name=m_name;
		this.m_department=m_department;
		//System.out.println("Employee ID:" +this.id + " Employee Name:" +this.name + " Employee Department:" +this.department);
		
	}
	
}
class emp extends manager{
	int e_id;
	String e_name;
	String e_department;
	public emp(int e_id,String e_name,String e_department) {
		super(20,"Dhruval","Designer");
		this.e_id=e_id;
		this.e_name=e_name;
		this.e_department=e_department;
		//System.out.println("Manager ID:" + this.id + " Manager name:" + this.name + " Manager Department:" + this.department);
	}
}
public class multilevel_inheritance_file {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		emp e=new emp(5,"Jay","Data Analyst");
		
		
		FileOutputStream fos=new FileOutputStream("admin.txt");
		ObjectOutputStream o=new ObjectOutputStream(fos);
		o.writeObject(e);
		
		
		FileInputStream fin=new FileInputStream("admin.txt");
		ObjectInputStream oi=new ObjectInputStream(fin);
		emp e1=(emp) oi.readObject();
		
		System.out.println("Employee ID:" + e1.e_id +" Employee Name:"+ e1.e_name +" Employee Department:" + e1.e_department);
		System.out.println("Admin ID:" + e1.id +" Admin Name:"+ e1.name +" Admin Department:" + e1.department);
		System.out.println("Manager ID:" + e1.m_id +" Manager Name:"+ e1.m_name +" Manager Department:" + e1.m_department);
	}
}
