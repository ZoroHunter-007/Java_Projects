package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Connection.Dbconn;
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
			PreparedStatement ps=con.prepareStatement("SELECT *FROM bank_app");
			ResultSet rs=ps.executeQuery();
			
			user_reg u;
			while(rs.next()) {
				u=new user_reg();
				u.setId(rs.getInt("id"));
				u.setEmail(rs.getString("email"));
				u.setUsername(rs.getString("username"));
				u.setPhone(rs.getString("phone"));
				u.setPassword(rs.getString("password"));
				u.setImage(rs.getBytes("image"));
				al.add(u);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
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
			PreparedStatement ps=con.prepareStatement("UPDATE bank_app SET username=?,phone=?,password=?,email=? WHERE id=?");
			ps.setString(1, ur.getUsername());
			ps.setString(2, ur.getPhone());
			ps.setString(3, ur.getPassword());
			ps.setString(4, ur.getEmail());
			ps.setInt(5, ur.getId());
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
	
	
}
