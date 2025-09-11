package Ass_java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

class Paitent{
	 int p_id;
	String p_name;
	String type;
	double cost;
	public Paitent(int p_id,String p_name,String type,double cost) {
		this.p_id=p_id;
		this.p_name=p_name;
		this.type=type;
		this.cost=cost;
		
	}
}

public class Smile_care_application {
	  
	driver_run d=new driver_run();
	Connection con=d.getConnection();
	public void insert() {
		Scanner sc=new Scanner(System.in);
		ArrayList<Paitent>al=new ArrayList<Paitent>();
		System.out.println("Enter the size of Paitent:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Paient ID:");
			int p_id=sc.nextInt();
			System.out.println("Enter the Paient Name:");
			String p_name=sc.next();
			System.out.println("Enter the Dental type:");
			String type=sc.next();
			System.out.println("Enter the Cost:");
			double cost=sc.nextDouble();
			
			al.add(new Paitent(p_id,p_name,type,cost));
			
			try {
				PreparedStatement ps=con.prepareStatement("insert into detntal(patient_id,patient_name,type,cost) values(?,?,?,?)");
				ps.setInt(1, p_id);
				ps.setString(2, p_name);
				ps.setString(3, type);
				ps.setDouble(4, cost);
				
				int j=ps.executeUpdate();
				if(j>0) {
					System.out.println("Data Inserted Sucessfully....");
				}
				else {
					System.out.println("Query Error...!");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public void disp() {
		try {
			PreparedStatement ps=con.prepareStatement("SELECT * from detntal");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("Paitent ID:"+rs.getInt("patient_id")+"\tPaitent Name:"+rs.getString("patient_name")+"\tType:"+rs.getString("type")+"\tCost:"+rs.getDouble("cost"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void close() {
		System.exit(0);
	}
	public static void main(String[] args) {
		Smile_care_application db=new Smile_care_application();
		Scanner sc=new Scanner(System.in);
		int ch=0;
		do {
			System.out.println("1.Insert Data into Table");
			System.out.println("2.Display Data");
			System.out.println("3.Exit");
			System.out.println("Enter the choice(1/3):");
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				db.insert();
				break;
				
			case 2:
				db.disp();
				break;
				
			
			case 3:
				db.close();
				break;
			
			default:
				System.out.println("Invalid choice enter by you...!");
				break;
			}
			System.out.println("Do you want to continue press(1 for yes/0 for no):");
			ch=sc.nextInt();
		}while(ch==1);
	}

}
