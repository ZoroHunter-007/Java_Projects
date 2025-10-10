package com.dao;

import java.util.List;


import com.model.User_reg;
import com.model.addMenu;

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
	
	//Add menu item
	public String AddMenu(addMenu m);
	
	public List<User_reg> getUserByPage(int start,int total);
	
     
}
