package com.dao;

import java.util.List;


import com.model.User_reg;

public interface DaoInterface  {
	//Insert Data
	public String InsertData(User_reg u);

	//verify Login
	public String VerifyLogin(User_reg u);
	//Show all Register data
	List<User_reg>showAllData();
	//Get data by id
	public User_reg GetId(int id);
	//update data by id
	public String UpdateId(User_reg u);
	
	//delet data by id
	public String DeleteId(int id);
	
	
	
}
