package com.Run;

import com.Dao.DataDao;
import com.model.User;

public class TestRun {

	public static void main(String[] args) {
		
		User u=new User();
		//u.setId(2);
		u.setUsername("newtestuser124");
		u.setEmail("newtest123@gmail.com");
		u.setPassword("newtest@123");
		
		DataDao dao=new DataDao();
		//dao.InsertData(u);
		//dao.UpdateData(u);
		//dao.DeleteData(u);
		//u=dao.FetchData(1);
		//System.out.println(u.getUsername()+" "+u.getEmail()+" "+u.getPassword());
		
		dao.FetchAllData().forEach(i->{
			System.out.println(i.getId()+" "+i.getUsername()+" "+i.getEmail()+" "+i.getPassword());
		});
		//System.out.println("Data Inserted Successfully....");
	}
}
