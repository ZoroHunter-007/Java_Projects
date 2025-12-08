package com.example.SpringBootBankApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.SpringBootBankApplication.entity.Account;
import com.example.SpringBootBankApplication.entity.Customer;
import com.example.SpringBootBankApplication.repository.AccountRepo;

@Service
public class AccountServiceClass {

	@Autowired
	private AccountRepo accountRepo;
	
	
	
	
	//insert the account data
	public Account SaveAccount(Account ac) {
		return accountRepo.save(ac);
	}
	
	//fetch the all account data exists in DB
	public List<Account>showAllData(){
		return accountRepo.findAll();
	}
	
	//fetch the data by ID(Single data only)
	public Account fetchById(int id) {
		return accountRepo.findById(id).orElse(null);
	}
	
	//Delete the data by ID
	public void DeleteById(int id) {
		 accountRepo.deleteById(id);
	}
	
	//update the data by ID
	public Account updateData(int id, Account ac) {
		Account account=accountRepo.findById(id).orElse(null);
		if(account!=null) {
			account.setAccType(ac.getAccType());
			account.setBalance(ac.getBalance());
			account.setStatus(ac.getStatus());
			return accountRepo.saveAndFlush(account);
		}
		else {
			return null;
		}
	}
	
}
