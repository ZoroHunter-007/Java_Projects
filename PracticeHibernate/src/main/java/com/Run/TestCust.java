package com.Run;

import com.DataDao.Data_Dao;
import com.ModelClass.Customer;
import com.ModelClass.Item;

public class TestCust {

	public static void main(String[] args) {
		
		Item it=new Item();
		
		it.setItem_id(104);
		it.setItem_name("CPU");
		System.out.println("Item Details:"+ it);
		
		Customer c=new Customer();
		//c.setCust_id(2);
		c.setCust_name("testusername");
		c.setCust_add("useraddress");
		c.setCity("usercity");
		c.setItem(it);
		
		Data_Dao d=new Data_Dao();
		
		//d.InsertData(c);
		//d.UpdateData(c);
		//d.DeleteData(c);
		/*c=d.FetchDatabyID(2);
		System.out.println(c.getCust_id()+" "+c.getCity()+" "+c.getCust_add()+" "+c.getCust_name());
		*/
		//System.out.println("Update Data Successfully...");
		
		/*d.ShowAllData().forEach(i->{
			System.out.println(i.getCust_id()+" "+i.getCity()+" "+i.getCust_add()+" "+i.getCust_name());
		});*/
		
		d.ShowData(c);
		System.out.println("Customer Details:"+c);
	}
}
