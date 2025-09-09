package practice_pakage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

class User_data{
	int id;
	double balance;
	String u_name,add;
	public User_data(int id,String u_name,String add,double balance) {
		this.id=id;
		this.u_name=u_name;
		this.add=add;
		this.balance=balance;
		
	}
}

public class user_connection {

	Scanner sc=new Scanner(System.in);
	driver_class d=new driver_class();
	Connection con=d.getConnection();
	String sql="insert into user(id,u_name,u_add,balance) values(?,?,?,?)";
	int id;
	String u_name,add;
	double balance;
	public void insert() {
		ArrayList<User_data> al=new ArrayList<User_data>();
		System.out.println("Enter the size of User:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter the User ID "+ (i+1)+":");
			id=sc.nextInt();
			System.out.println("Enter the Username "+ (i+1)+":");
			u_name=sc.next();
			System.out.println("Enter the User Address "+ (i+1)+":");
			add=sc.next();
			System.out.println("Enter the User Balance "+ (i+1)+":");
			balance=sc.nextDouble();
			al.add(new User_data(id, u_name, add, balance));
			try {
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, id);
				ps.setString(2, u_name);
				ps.setString(3, add);
				ps.setDouble(4, balance);
				int j=ps.executeUpdate();
				if(j>0) {
					System.out.println("Data inserted Successfully...");
				}
				else {
					System.out.println("Query error...!");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	public void disp() {
		try {
			PreparedStatement ps=con.prepareStatement("select *from user");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("User ID: "+rs.getInt("id")+"\t Username: "+ rs.getString("u_name")+"\t User Address: "+rs.getString("u_add")+"\t User No: "+rs.getDouble("balance"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void update() {
		
		String sql="update user set u_name=?,u_add=?,balance=? where id=?";
		System.out.println("Enter the ID you want to Update:");
		int id=sc.nextInt();
		System.out.println("Enter the new Username:");
		String u_name=sc.next();
		System.out.println("Enter the new User Address:");
		String u_add=sc.next();
		System.out.println("Enter the new User Balance:");
		double balance=sc.nextDouble();
		
		
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,u_name );
			ps.setString(2, u_add);
			ps.setDouble(3, balance);
			ps.setInt(4, id);
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println("Data Updated Successfully...");
			}
			else {
				System.out.println("Id not found...!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void id_disp() {
		System.out.println("Enter the ID you want to Serach:");
		int id=sc.nextInt();
		try {
			PreparedStatement ps=con.prepareStatement("select u_name,u_add,balance from user where id=?");
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("Username: "+ rs.getString("u_name")+"\tUser Address: "+rs.getString("u_add")+"\tUser Balance: "+rs.getDouble("balance"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void delete() {
		System.out.println("Enter the ID you want to Delete:");
		int id=sc.nextInt();
		try {
			PreparedStatement ps=con.prepareStatement("delete from user where id=?");
			ps.setInt(1, id);
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println("Data deleted Successfully...");
			}
			else {
				System.out.println("ID not found...!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void transfer() {
		System.out.println("Enter the FromId:");
		int FromId=sc.nextInt();
		System.out.println("Enter the ToId:");
		int ToId=sc.nextInt();
		System.out.println("Enter the Transfer amount:");
		int amount=sc.nextInt();
		
		try {
			PreparedStatement ps=con.prepareStatement("select balance from user where id=?");
			ps.setInt(1, FromId);
			ResultSet rs=ps.executeQuery();
			double balance=0.0;
			if(rs.next()) {
				balance=rs.getDouble("balance");
			}
			if(balance>amount) {
				PreparedStatement ps1=con.prepareStatement("update user set balance=balance-? where id=?");
				ps1.setInt(1, amount);
				ps1.setInt(2, FromId);
				int i=ps1.executeUpdate();
				if(i>0) {
					System.out.println(amount+" Debited from the "+FromId);
				}
				else {
					System.out.println("Failed to transfer...!");
				}
			}
			else {
				System.out.println(FromId+" Insufficient Balance in your A/C...!");
				return;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			PreparedStatement ps=con.prepareStatement("update user set balance=balance+? where id=?");
			ps.setInt(1, amount);
			ps.setInt(2, ToId);
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println(amount+ " Credited Successfully to.. "+ToId);
			}
			else {
				System.out.println("Failed to transfer...!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void HighBal() {
		try {
			PreparedStatement ps=con.prepareStatement("select * from user where balance=(select max(balance) from user)");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("u_name");
				double balance=rs.getDouble("balance");
				System.out.println("\nHighest Balance Data:");
				System.out.println("User ID: "+id+"\t Username: "+name+"\t Balance: "+balance);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void LowBal() {
		try {
			PreparedStatement ps=con.prepareStatement("select * from user where balance=(select min(balance) from user)");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("u_name");
				double balance=rs.getDouble("balance");
				
				System.out.println("\nLowest Balance Data:");
				System.out.println("User ID: "+id+"\t Username: "+name+"\t Balance: "+balance);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void ShowUsersByNameAsc() {
	    try {
	        // Query to get users in reverse order of name
	        PreparedStatement ps = con.prepareStatement(
	            "SELECT * FROM user ORDER BY u_name ASC"
	        );

	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            int id = rs.getInt("id");
	            String name = rs.getString("u_name");
	            double balance = rs.getDouble("balance");

	            System.out.println("ID: " + id + ", Name: " + name + ", Balance: " + balance);
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	public void ShowUsersByNameDesc() {
	    try {
	        // Query to get users in reverse order of name
	        PreparedStatement ps = con.prepareStatement(
	            "SELECT * FROM user ORDER BY u_name DESC"
	        );

	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            int id = rs.getInt("id");
	            String name = rs.getString("u_name");
	            double balance = rs.getDouble("balance");

	            System.out.println("ID: " + id + ", Name: " + name + ", Balance: " + balance);
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
	
	public void display_user_transaction() {
		try {
			PreparedStatement ps=con.prepareStatement("SELECT u.ac_num,u.u_name,t.t_id AS transaction_id,t.amount,t.type,t.date FROM user u JOIN user_transaction t ON u.ac_num=t.acc_no");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("Account Number: "+rs.getInt("ac_num")+"\tUsername:"+rs.getString("u_name")+"\tTransaction ID:"+rs.getInt("transaction_id")+"\tAmount:"+rs.getDouble("amount")+"\tPayment type:"+rs.getString("type")+"\tTransaction Date:"+rs.getDate("date"));
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
		user_connection db=new user_connection();
		Scanner sc=new Scanner(System.in);
		int ch=0;
		do {
			System.out.println("1.Insert Data");
			System.out.println("2.Display Data");
			System.out.println("3.Update Data");
			System.out.println("4.Select ID you want to Serach");
			System.out.println("5.Delete ID you want");
			System.out.println("6.Transfer the amount");
			System.out.println("7.Highest Balance");
			System.out.println("8.Lowesr Balance");
			System.out.println("9.A-Z Username give");
			System.out.println("10.Z-A Username give");
			System.out.println("11.Display User Transaction Data");
			System.out.println("12.Exit");
			System.out.println("Enter your choice(1/12):");
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
				db.id_disp();
				break;
				
			case 5:
				db.delete();
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
				db.ShowUsersByNameAsc();
				break;
				
			case 10:
				db.ShowUsersByNameDesc();
				break;
				
			case 11:
				db.display_user_transaction();
				break;
				
			
			case 12:
				db.close();
				break;
			
			default:
				System.out.println("Invalid choice...!");
				break;
			}
			System.out.println("Do you want to continue..(1/0):");
			ch=sc.nextInt();
		}while(ch==1);
	}
}
