package sql_connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
//insert multiple data
//batch processing=>group of sql statements
//batch processing is used to increase the performance of the application
class Account{
	String id,password;
	double balance;
	public Account(String id,String password,double balance) {
		this.id=id;
		this.password=password;
		this.balance=balance;
	}
}
public class login_data {

	Connection_file c=new Connection_file();
	Connection con=c.gConnection();
	
	public void insert(String id,String password,double balance) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into login(id,password,balance) values(?,?,?)");
			ps.setString(1, id);
			ps.setString(2, password);
			ps.setDouble(3, balance);
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println("Data Inserted....");
			}
			else {
				System.out.println("Data not inserted...!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
		}
	public void disp(String id,String password) {
		try {
			PreparedStatement ps=con.prepareStatement("select *from login where id=? and password=?");
			ps.setString(1, id);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			System.out.println("Login Successfully...");
		}
		else {
			System.out.println("Invalid user...");
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void close() {
		System.exit(0);
	}
	public void ArrayListadd(String id,String password,double balance) {
		String sql="insert into login(id,password,balance) values(?,?,?)";
		ArrayList<Account>al=new ArrayList<Account>();
		al.add(new Account(id, password, balance));
		for(Account a:al) {
			try {
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, a.id);
				ps.setString(2, a.password);
				ps.setDouble(3, a.balance);
				int i=ps.executeUpdate();
				if(i>0) {
					System.out.println("Data Inserted....");
				}
				else {
					System.out.println("Data not found...!");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void transfer(String FromId,String ToId,double amount) {
		try {
			PreparedStatement ps=con.prepareStatement("update login set balance=balance-? where id=?");
			ps.setDouble(1, amount);
			ps.setString(2, FromId);
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println(amount+" Amount debited from "+ FromId);
			}
			else {
				System.out.println("Falid to transfer...!");
			}
			
			PreparedStatement ps1=con.prepareStatement("update login set balance=balance+? where id=?");
			ps1.setDouble(1, amount);
			ps1.setString(2, ToId);
			int i1=ps1.executeUpdate();
			if(i1>0) {
				System.out.println(amount+" Amount credited to "+ ToId);
			}
			else {
				System.out.println("Faild to transfer...!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		login_data l=new login_data();
		Scanner sc=new Scanner(System.in);
		int ch=0;
		do {
			System.out.println("1.Insert Data");
			System.out.println("2.Insert Data using Arraylist");
			System.out.println("3.Aunthentication");
			System.out.println("4.Transfer Amount");
			System.out.println("5.Exit");
			System.out.println("Enter your choice(1-5):");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the size of data:");
				int size=sc.nextInt();
				for(int i=0;i<size;i++) {
					System.out.println("Enter the id:");
					String id=sc.next();
					System.out.println("Enter the password:");
					String pwd=sc.next();
					System.out.println("Enter the balance:");
					double balance=sc.nextDouble();
					l.insert(id, pwd,balance);
				}
				
			break;
			
			case 2:
				System.out.println("Enter the id:");
				String id=sc.next();
				System.out.println("Enter the password:");
				String pwd=sc.next();
				System.out.println("Enter the balance:");
				double balance=sc.nextDouble();
				l.ArrayListadd(id, pwd, balance);
				break;
				
			case 3:
				System.out.println("Enter the id:");
				String id1=sc.next();
				System.out.println("Enter the password:");
				String pwd1=sc.next();
				double bal=0.0;
				l.disp(id1, pwd1);
				break;
				
			case 4:
				System.out.println("Enter the FromId:");
				String FrmoId=sc.next();
				System.out.println("Enter the ToId:");
				String ToId=sc.next();
				System.out.println("Enter the amount to transfer:");
				double amount=sc.nextDouble();
				l.transfer(FrmoId, ToId, amount);
				break;
			case 5:
				l.close();
				break;
				
			default:
				System.out.println("Invalid choice...!");
				break;
			}
			System.out.println("do you want to continue(1/0):");
			ch=sc.nextInt();
		}while(ch==1);
	}
}
