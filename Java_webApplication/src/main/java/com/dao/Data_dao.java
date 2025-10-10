package com.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import com.Connection.Dbconn;
import com.model.Account;

import com.model.user_reg;



public class Data_dao implements Data_dao_interface{


	Dbconn db=new Dbconn();
	Connection con=db.getConnection();
	public String InsertData(user_reg ur) {
	
		try {
			PreparedStatement ps=con.prepareStatement("INSERT INTO bank_app(username,phone,email,password,image) VALUES(?,?,?,?,?)");
			ps.setString(1, ur.getUsername());
			ps.setString(2, ur.getPhone());
			ps.setString(3, ur.getEmail());
			ps.setString(4, ur.getPassword());
			ps.setBytes(5, ur.getImage());
			int i=ps.executeUpdate();
			 if (i > 0) {
			        
			            return "Success";   
			    
			    }


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<user_reg> showAllData() {
		// TODO Auto-generated method stub
		ArrayList<user_reg>al=new ArrayList<user_reg>();
		
		try {
			PreparedStatement ps=con.prepareStatement("SELECT id,email,username,phone,password FROM bank_app");
			ResultSet rs=ps.executeQuery();
			
			user_reg u;
			while(rs.next()) {
				u=new user_reg();
				u.setId(rs.getInt("id"));
				u.setEmail(rs.getString("email"));
				u.setUsername(rs.getString("username"));
				u.setPhone(rs.getString("phone"));
				u.setPassword(rs.getString("password"));
				al.add(u);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}
	public byte[] showImage(int id) {
		byte [] imageShow=null;
		try {
			PreparedStatement ps=con.prepareStatement("SELECT image FROM bank_app WHERE id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
			 imageShow=rs.getBytes("image");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
		return imageShow;
	}
	@Override
	public user_reg GetId(int id) {
		// TODO Auto-generated method stub
		user_reg u=null;
		try {
			PreparedStatement ps=con.prepareStatement("SELECT *FROM bank_app WHERE id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				u=new user_reg();
				u.setId(rs.getInt("id"));
				u.setEmail(rs.getString("email"));
				u.setUsername(rs.getString("username"));
				u.setPhone(rs.getString("phone"));
				u.setPassword(rs.getString("password"));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return u;
	}
	@Override
	public String DeleteId(int id) {
	    // 1. Use try-with-resources to automatically close the PreparedStatement and Connection
	   try {
		PreparedStatement ps=con.prepareStatement("DELETE FROM bank_app WHERE id=?");
		ps.setInt(1, id);
		int i=ps.executeUpdate();
		if(i>0) {
			return "Delete";
		}
		
	   } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   return null;
	   
	}
	@Override
	public String UpdateData(user_reg ur) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=con.prepareStatement("UPDATE bank_app SET username=?,phone=?,password=?,email=? ,image=? WHERE id=?");
			ps.setString(1, ur.getUsername());
			ps.setString(2, ur.getPhone());
			ps.setString(3, ur.getPassword());
			ps.setString(4, ur.getEmail());
			ps.setBytes(5, ur.getImage());
			ps.setInt(6, ur.getId());
			int i=ps.executeUpdate();
			if(i>0) {
				return "Update";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public String VerifyLogin(user_reg ur) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=con.prepareStatement("SELECT *FROM bank_app WHERE email=? AND password=?");
			ps.setString(1, ur.getEmail());
			ps.setString(2, ur.getPassword());
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				return "Success";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public String InsertAccount(Account a) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=con.prepareStatement("INSERT INTO account(ac_number,holder_name,ac_type,balance) VALUES(?,?,?,?)");
			ps.setString(1, a.getAc_number());
			ps.setString(2, a.getHolder_name());
			ps.setString(3, a.getAc_type());
			ps.setDouble(4, a.getBalance());
			int i=ps.executeUpdate();
			if(i>0){
				return "Inserted";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Account> ShowAccount() {
		ArrayList<Account>al=new ArrayList<Account>();
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=con.prepareStatement("SELECT* FROM account");
			ResultSet rs=ps.executeQuery();
			Account a;
			while(rs.next()) {
				a=new Account();
				a.setAc_id(rs.getInt("ac_id"));
				a.setAc_number(rs.getString("ac_number"));
				a.setHolder_name(rs.getString("holder_name"));
				a.setAc_type(rs.getString("ac_type"));
				a.setBalance(rs.getDouble("balance"));
				al.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return al;
	}

	@Override
	public String InsertTransaction(Account a) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=con.prepareStatement("INSERT INTO transactions(ac_no,amount,t_type) VALUES(?,?,?)");
			ps.setString(1, a.getAc_no());
			ps.setDouble(2, a.getAmount());
			ps.setString(3, a.getT_type());
			int i=ps.executeUpdate();
			if(i>0) {
				return "Inserted";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Account> ShowTransaction() {
		// TODO Auto-generated method stub
		ArrayList<Account>al=new ArrayList<Account>();
		try {
			PreparedStatement ps=con.prepareStatement("SELECT a.ac_number,a.holder_name,a.balance,t.t_id AS transaction_id,t.amount,t.t_type,t.t_date FROM account a JOIN transactions t ON a.ac_number=t.ac_no");
			ResultSet rs=ps.executeQuery();
			Account a;
			while(rs.next()) {
				a=new Account();
				a.setAc_number(rs.getString("ac_number"));
				a.setHolder_name(rs.getString("holder_name"));
				a.setBalance(rs.getDouble("balance"));
				a.setT_id(rs.getInt("transaction_id"));
				a.setAmount(rs.getDouble("amount"));
				a.setT_type(rs.getString("t_type"));
				a.setDate(rs.getObject("t_date",LocalDateTime.class));
				al.add(a);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}
	
	
}
