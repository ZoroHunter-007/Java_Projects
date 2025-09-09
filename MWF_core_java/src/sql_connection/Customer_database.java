package sql_connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

class Cust{
	int c_id,c_no;
	String c_name;
	double c_bal;
	public Cust(int c_id,int c_no,String c_name,double c_bal) {
		this.c_id=c_id;
		this.c_no=c_no;
		this.c_name=c_name;
		this.c_bal=c_bal;
	}
}
public class Customer_database {

	Connection_file c=new Connection_file();
	Connection con=c.gConnection();
	static Scanner sc=new Scanner(System.in);
	
	//Insert Data into Database
	public void insert() {
		ArrayList<Cust>al=new ArrayList<Cust>();
		System.out.println("Enter the number of Customer:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Customer ID "+(i+1)+":");
			int c_id=sc.nextInt();
			System.out.println("Enter the Customer No "+(i+1)+":");
			int c_no=sc.nextInt();
			System.out.println("Enter the Customer Name "+(i+1)+":");
			String c_name=sc.next();
			System.out.println("Enter the Customer Balance "+(i+1)+":");
			double c_bal=sc.nextDouble();
			al.add(new Cust(c_id, c_no, c_name, c_bal));
			
			try {
				PreparedStatement ps=con.prepareStatement("insert into cust(cust_id,cust_no,cust_name,cust_bal) values(?,?,?,?)");
				ps.setInt(1, c_id);
				ps.setInt(2, c_no);
				ps.setString(3, c_name);
				ps.setDouble(4, c_bal);
				int j=ps.executeUpdate();
				if(j>0) {
					System.out.println("Data Inserted Successfully...");
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
	//Display Data into Database
	public void disp() {
		try {
			PreparedStatement ps=con.prepareStatement("select * from cust");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("Customer ID: "+rs.getInt("cust_id")+"\t Customer No: "+rs.getInt("cust_no")+"\t Customer Name: "+rs.getString("cust_name")+"\t Customer Balance: "+rs.getDouble("cust_bal"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//Update Data into Database
	public void update() {
		System.out.println("Enter the ID you want to Update:");
		int u_id=sc.nextInt();
		System.out.println("Enter the New Customer No:");
		int u_no=sc.nextInt();
		System.out.println("Enter the New Customer Name:");
		String u_name=sc.next();
		System.out.println("Enter the New Customer Balance:");
		double u_bal=sc.nextDouble();
		try {
			PreparedStatement ps=con.prepareStatement("update cust set cust_no=?,cust_name=?,cust_bal=? where cust_id=?");
			ps.setInt(1, u_no);
			ps.setString(2, u_name);
			ps.setDouble(3, u_bal);
			ps.setInt(4, u_id);
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println("Data Updated Successfully...");
			}
			else {
				System.out.println("Query Error...!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//Delete Data into Database
	public void delete() {
		System.out.println("Enter the ID you want to Delete:");
		int d_id=sc.nextInt();
		
		try {
			PreparedStatement ps=con.prepareStatement("delete from cust where cust_id=?");
			ps.setInt(1, d_id);
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println("Data Deleted Successfully....");
			}
			else {
				System.out.println("Query Error...!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 //Search Id you want from the Database
	public void SerachId() {
		System.out.println("Enter the ID you want to Search:");
		int s_id=sc.nextInt();
		
		try {
			PreparedStatement ps=con.prepareStatement("select cust_no,cust_name,cust_bal from cust where cust_id=?");
			ps.setInt(1, s_id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int c_no=rs.getInt("cust_no");
				String c_name=rs.getString("cust_name");
				double c_bal=rs.getDouble("cust_bal");
				
				System.out.println("Customer No: "+c_no+"\t Customer Name: "+c_name+"\t Customer Balance: "+c_bal);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//Transfer Amount From one customer to another customer
	public void transfer() {
		System.out.println("Enter the FromId:");
		int FromId=sc.nextInt();
		System.out.println("Enter the ToId:");
		int ToId=sc.nextInt();
		System.out.println("Enter the Amount:");
		int amt=sc.nextInt();
		
		try {
			PreparedStatement ps=con.prepareStatement("select cust_bal from cust where cust_id=?");
			ps.setInt(1, FromId);
			ResultSet rs=ps.executeQuery();
			double balance=0.0;
			while(rs.next()) {
				 balance=rs.getDouble("cust_bal");
				
			}
			if(balance>amt) {
				PreparedStatement ps1=con.prepareStatement("update cust set cust_bal=cust_bal-? where cust_id=?");
				ps1.setInt(1, amt);
				ps1.setInt(2, FromId);
				int i=ps1.executeUpdate();
				if(i>0) {
					System.out.println(amt+" Debited from the "+FromId);
				}
				else {
					System.out.println("Failed to Transfer...!");
				}
			}
			else {
				System.out.println("Insufficient Balance...!");
				return;
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			PreparedStatement ps=con.prepareStatement("update cust set cust_bal=cust_bal+? where cust_id=?");
			ps.setInt(1, amt);
			ps.setInt(2, ToId);
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println(amt+ " Credited to the.. "+ToId);
			}
			else {
				System.out.println("Failed to Transfer...!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	//Display Highest Balance Data
	public void HighBal() {
		try {
			PreparedStatement ps=con.prepareStatement("select *from cust where cust_bal=(select max(cust_bal) from cust)");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int h_id=rs.getInt("cust_id");
				int h_no=rs.getInt("cust_no");
				String h_name=rs.getString("cust_name");
				double h_bal=rs.getDouble("cust_bal");
				
				System.out.println("\nHighest Balance Data");
				System.out.println("Customer ID: "+h_id+"\t Customer No: "+h_no+"\t Customer Name: "+h_name+"\t Customer Balance: "+h_bal);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//Display Lowest Balance Data
	public void LowBal() {
		try {
			PreparedStatement ps=con.prepareStatement("select *from cust where cust_bal=(select min(cust_bal) from cust)");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int h_id=rs.getInt("cust_id");
				int h_no=rs.getInt("cust_no");
				String h_name=rs.getString("cust_name");
				double h_bal=rs.getDouble("cust_bal");
				
				System.out.println("\nLowest Balance Data");
				System.out.println("Customer ID: "+h_id+"\t Customer No: "+h_no+"\t Customer Name: "+h_name+"\t Customer Balance: "+h_bal);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//Display A-Z Order by name
	public void OrderByName() {
		try {
			PreparedStatement ps=con.prepareStatement("select * from cust  order by cust_name asc");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("cust_id");
				int no=rs.getInt("cust_no");
				String name=rs.getString("cust_name");
				double bal=rs.getDouble("cust_bal");
				
				System.out.println("Customer ID: "+id+"\t Customer No: "+no+"\t Customer Name: "+name+"\t Customer Balance: "+bal);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//Display Z-A order by name
	public void DisorderByName() {
		try {
			PreparedStatement ps=con.prepareStatement("select * from cust  order by cust_name desc");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("cust_id");
				int no=rs.getInt("cust_no");
				String name=rs.getString("cust_name");
				double bal=rs.getDouble("cust_bal");
				
				System.out.println("Customer ID: "+id+"\t Customer No: "+no+"\t Customer Name: "+name+"\t Customer Balance: "+bal);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//Exit from the Program
	public void close() {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		Customer_database db=new Customer_database();
		int ch=0;
		do {
			
			System.out.println("1.Insert Data into Database");
			System.out.println("2.Display Data into Database");
			System.out.println("3.Update Data into Database");
			System.out.println("4.Delete Data into Database");
			System.out.println("5.Search ID into Database");
			System.out.println("6.Transfer the Amount");
			System.out.println("7.Highest Balance into Database");
			System.out.println("8.Lowest Balance into Database");
			System.out.println("9.Order By A-Z name");
			System.out.println("10.Order by Z-A name");
			System.out.println("11.Exit");
			System.out.println("Enter your choice(1/11):");
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				db.insert();
				break;
				
			case 2:
				db.disp();
				break;
				
			case 3:
				db.update();
				break;
				
			case 4:
				db.delete();
				break;
				
			case 5:
				db.SerachId();
				break;
				
			case 6:
				db.transfer();
				break;
				
			case 7:
				db.HighBal();
				break;
				
			case 8:
				db.LowBal();
				break;
				
			case 9:
				db.OrderByName();
				break;
				
			case 10:
				db.DisorderByName();
				break;
				
			case 11:
				db.close();
				break;
			
			default:
				System.out.println("Invalid choice...!");
			}
			System.out.println("Do you want to continue...(1 for yes/0 for no):");
			ch=sc.nextInt();
		}while(ch==1);
	}
}
