package sql_connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

class Bank_arraylist{
	String ac_name;
	int ac_no;
	double balance;
	public Bank_arraylist(int ac_no,String ac_name,double balance) {
		this.ac_no=ac_no;
		this.ac_name=ac_name;
		this.balance=balance;
		
	}
}
public class bank_database {

	
	Connection_file c=new Connection_file();
	Connection con=c.gConnection();
	String sql="insert into bank(ac_no,ac_name,balance) values(?,?,?)";
	public void insert(int ac_no,String ac_name,double balance) {
		ArrayList<Bank_arraylist>al=new ArrayList<Bank_arraylist>();
		al.add(new Bank_arraylist(ac_no, ac_name, balance));
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, ac_no);
			ps.setString(2, ac_name);
			ps.setDouble(3, balance);
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println("Data inserted Successfuylly...");
			}
			else {
				System.out.println("Faild to Insert data...!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void transfer() {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the FromId:");
		String fromId=sc.next();
		System.out.println("Enter the ToId:");
		String ToId=sc.next();
		System.out.println("Enter the Transfer Amount:");
		int amount=sc.nextInt();
		
		try {
			
			PreparedStatement ps2=con.prepareStatement("select balance from bank where id=?");
			ps2.setString(1, fromId);
			ResultSet rs=ps2.executeQuery();
			double balance=0.0;
			if(rs.next()) {
				balance=rs.getDouble("balance");
				
			}
			if(balance>amount) {
			PreparedStatement ps=con.prepareStatement("update bank set balance=balance-? where id=?");
			ps.setInt(1, amount);
			ps.setString(2, fromId);
			int i=ps.executeUpdate();
			if(i>0) {
			System.out.println(amount+" Successfully Transfer to... "+ToId);
			}
			else {
				System.out.println("Faild to transfer...!");
			}
		}
			
			else {
				
				System.out.println("Insufficient Balance... "+fromId);
				return;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			PreparedStatement ps1=con.prepareStatement("update bank set balance=balance+? where id=?");
			ps1.setInt(1, amount);
			ps1.setString(2, ToId);
			int i=ps1.executeUpdate();
			if(i>0) {
				System.out.println(amount+ " Credited Successfully "+ToId);
			}
			
			else {
				
				System.out.println("Falid transfer from "+fromId);
			}
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void disp() {
		try {
			PreparedStatement ps=con.prepareStatement("SELECT u.ac_no,u.ac_name,t.id AS transaction_id,t.amount,t.p_type,t.date FROM bank u JOIN TRANSACTION t ON u.ac_no=t.acc_num ORDER BY  u.ac_no,t.DATE DESC;");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("Account Number:"+rs.getInt("ac_no")+"\tAccount Holder Name:"+rs.getString("ac_name")+"\tTransaction ID:"+rs.getInt("transaction_id")+"\tAmount:"+rs.getDouble("amount")+"\tPayment Type:"+rs.getString("p_type")+"\tDate:"+rs.getDate("date"));
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
		Scanner sc=new Scanner(System.in);
		bank_database db=new bank_database();
		int ch=0;
		do {
			System.out.println("1.Insert Data");
			System.out.println("2.Transfer the Amount");
			System.out.println("3.Display Data");
			System.out.println("4.Exit");
			System.out.println("Enter the choice(1-4):");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
			System.out.println("Enter the size of a customer:");
			int size=sc.nextInt();
			for(int i=0;i<size;i++) {
				System.out.println("Enter the Account Number:");
				int ac_no=sc.nextInt();
				System.out.println("Enter the Customer Name:");
				String ac_name=sc.next();
				System.out.println("Enter the Balance:");
				double balance=sc.nextDouble();
				
				db.insert(ac_no, ac_name, balance);
				
			}
			break;
			
			case 2:
				db.transfer();
			
			
			
			break;
			
			case 3:
				db.disp();
				break;
				
			
			case 4:
				db.close();
				break;
				
			
			default:
				System.out.println("Invalid Choice...!");
				break;
			}
		
			System.out.println("Do you want to continue....Press(1/0):");
			ch=sc.nextInt();
		
		}while(ch==1);
		
	}
}
