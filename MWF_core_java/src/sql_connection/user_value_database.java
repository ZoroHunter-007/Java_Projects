package sql_connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class user_value_database {

	Connection_file c=new Connection_file();
	Connection con=c.gConnection();
	
	public void insert(int rno,String s_name,String department)
	{
		try {
			PreparedStatement ps=con.prepareStatement("insert into student(rno,s_name,department) values(?,?,?)");
			ps.setInt(1, rno);
			ps.setString(2, s_name);
			ps.setString(3, department);
			ps.executeUpdate();
			System.out.println("Data Inserted Successfully....");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	public void update(int rno,String s_name,String department,int id)
	{
		try {
			PreparedStatement ps=con.prepareStatement("update student set rno=?,s_name=?,department=? where id=?");
			ps.setInt(1, rno);
			ps.setString(2, s_name);
			ps.setString(3, department);
			ps.setInt(4, id);
			ps.executeUpdate();
			System.out.println("Data Updated Successfully...");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	public void delete(int id)
	{
		try {
			PreparedStatement ps=con.prepareStatement("delete from student where id=?");
			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("Data Deleted Successfully...");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	public void display() {
		try {
			PreparedStatement ps=con.prepareStatement("select* from student");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("id");
				int rno=rs.getInt("rno");
				String name=rs.getString("s_name");
				String department=rs.getString("department");
				
				System.out.println("Student ID:"+ id+ "\tStudent Roll no:"+rno+"\tStudent Name:"+name+"\tStudent Department:"+department);
			}
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void close() {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		user_value_database db=new user_value_database();
		Scanner sc=new Scanner(System.in);
		int id=0;
		int ch=0;
		int rno=0;
		String name=null;
		String department=null;
		do {
			System.out.println("1.Insert Data into Database");
			System.out.println("2.Update Data into Database");
			System.out.println("3.Delete Data into Database");
			System.out.println("4.Display Data into Database");
			System.out.println("5.Exit");
			System.out.println("Enter choice from(1-5):");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter total number of Students:");
				int size=sc.nextInt();
				for(int i=0;i<size;i++) {
					System.out.println("Enter Student Roll No:");
					rno=sc.nextInt();
					System.out.println("Enter Student Name:");
					name=sc.next();
					System.out.println("Enter Student Department:");
					department=sc.next();
					db.insert(rno, name, department);
				}
				break;
				
			case 2:
				System.out.println("Enter ID you want to Update:");
				int u_id=sc.nextInt();
				System.out.println("Enter Student Roll No:");
				rno=sc.nextInt();
				System.out.println("Enter Student Name:");
				name=sc.next();
				System.out.println("Enter Student Department:");
				department=sc.next();
				db.update(rno, name, department, u_id);
				break;
				
			case 3:
				System.out.println("Enter id you want to Delete:");
				int d_id=sc.nextInt();
				db.delete(d_id);
			break;
			
			case 4:
				db.display();
				break;
				
			case 5:
				db.close();
				break;
				
			default:
				System.out.println("Invalid Choice....!Please try again");
				break;
			}
			System.out.println("Do you want to continue(1/0):");
			ch=sc.nextInt();
			
		}while(ch==1);
	}
}
