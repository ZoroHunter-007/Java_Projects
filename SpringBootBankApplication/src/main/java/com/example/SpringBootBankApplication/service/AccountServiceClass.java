package com.example.SpringBootBankApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.SpringBootBankApplication.entity.Account;
import com.example.SpringBootBankApplication.repository.AccountRepo;

@Service
public class AccountServiceClass {

	@Autowired
	private AccountRepo accountRepo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	private String generateAccountNumber() {
		long random=(long)(Math.random()* 900000000000L)+100000000000L;
		return "AC" +random;
	}
	
	private String uniqueAccNumber() {
		String ac;
		do {
			ac=generateAccountNumber();
			
		}while(accountRepo.existsByaccNumber(ac));
		return ac;
	}
	
	public Account SaveAccount(Account ac) {
		ac.setAccNumber(generateAccountNumber());
		return accountRepo.save(ac);
	}
	
}
