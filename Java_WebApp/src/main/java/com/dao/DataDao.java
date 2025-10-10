package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.connection.Driver_load;


import com.model.User_reg;
import com.model.addMenu;

public class DataDao implements DaoInterface {

	Driver_load dr=new Driver_load();
	Connection con=dr.getConnection();
	@Override
	public String InsertData(User_reg u) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=con.prepareStatement("INSERT INTO user_reg(fullname,email,username,password,image) VALUES(?,?,?,?,?)");
			ps.setString(1, u.getFullname());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getUsername());
			ps.setString(4, u.getPassword());
			ps.setBytes(5, u.getImage());
			int i=ps.executeUpdate();
			
			if(i>0) {
				return "Insert";
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	

	@Override
	public List<User_reg> showAllData() {
		// TODO Auto-generated method stub
		ArrayList<User_reg>al=new ArrayList<User_reg>();
		try {
			PreparedStatement ps=con.prepareStatement("SELECT *FROM user_reg");
			ResultSet rs=ps.executeQuery();
			
			User_reg u;
			while(rs.next()) {
				u=new User_reg();
				u.setId(rs.getInt("id"));
				u.setFullname(rs.getString("fullname"));
				u.setEmail(rs.getString("email"));
				u.setUsername(rs.getString("username"));
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
	public byte[] ImageShow(int id) {
		
		byte image[]=null;
		try {
			PreparedStatement ps=con.prepareStatement("SELECT image FROM user_reg WHERE id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				image=rs.getBytes("image");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return image;
	}

	@Override
	public User_reg GetId(int id) {
		// TODO Auto-generated method stub
		User_reg u=null;
		try {
			PreparedStatement ps=con.prepareStatement("SELECT *FROM user_reg WHERE id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				u=new User_reg();
				u.setId(rs.getInt("id"));
				u.setFullname(rs.getString("fullname"));
				u.setEmail(rs.getString("email"));
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return u;
	}

	@Override
	public String UpdateId(User_reg ur) {
		// TODO Auto-generated method stub

		try {
		
			PreparedStatement ps=con.prepareStatement("UPDATE user_reg SET fullname=?, email=?, username=?, password=?, image=? WHERE id=?");
			ps.setString(1,ur.getFullname());
			ps.setString(2, ur.getEmail());
			ps.setString(3, ur.getUsername());
			ps.setString(4, ur.getPassword());
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
	public String DeleteId(int id) {
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement ps=con.prepareStatement("DELETE FROM user_reg WHERE id=?");
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
	public String VerifyLogin(User_reg u) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=con.prepareStatement("SELECT * FROM user_reg WHERE email=? AND password=?");
			ps.setString(1, u.getEmail());
			ps.setString(2, u.getPassword());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				return "Login";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}



	@Override
	public String AddMenu(addMenu m) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=con.prepareStatement("INSERT INTO addmenu(item_nm,desci,price,cat,img) VALUES(?,?,?,?,?)");
			ps.setString(1, m.getItemName());
			ps.setString(2, m.getDescription());
			ps.setDouble(3, m.getPrice());
			ps.setString(4, m.getCat());
			ps.setBytes(5, m.getImageItem());
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
	public List<User_reg> getUserByPage(int start, int total) {
		// TODO Auto-generated method stub
		ArrayList<User_reg>al=new ArrayList<User_reg>();
		try {
			PreparedStatement ps=con.prepareStatement("SELECT *FROM user_reg LIMIT ?,?");
			ps.setInt(1, start);
			ps.setInt(2, total);
			ResultSet rs=ps.executeQuery();
			User_reg u;
			while(rs.next()) {
				u=new User_reg();
				 u.setId(rs.getInt("id"));
	                u.setFullname(rs.getString("fullname"));
	                u.setEmail(rs.getString("email"));
	                u.setUsername(rs.getString("username"));
	                u.setPassword(rs.getString("password"));
	                al.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return al;
	}
	
	public int getTotalUser() {
		int count=0;
		
		try {
			PreparedStatement ps=con.prepareStatement("SELECT COUNT(*) FROM user_reg");
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				count=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;
	}



	




	
}
