package com.dao;
import java.util.List;

import com.model.Account;

import com.model.user_reg;

public interface Data_dao_interface {

	
	public String InsertData(user_reg ur);
	
	//verify login
	public String VerifyLogin(user_reg ur);
	
	//show all Register Data
	List<user_reg>showAllData();
	
	public user_reg GetId(int id);
	public String DeleteId(int id);
	
	public String UpdateData(user_reg ur);
	
	public String InsertAccount(Account a);
	
	List<Account>ShowAccount();
	
   public String InsertTransaction(Account a);
    
    public void WithdrawAmount(String ac_number, double amount);
	
	
	List<Account>ShowTransaction();
	
}
