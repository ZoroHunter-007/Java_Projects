package com.example.SpringBootDev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {

	@Autowired
	private BankRepository bankrepository;
	
	public Bank SaveBankData(Bank b) {
		return bankrepository.saveAndFlush(b);
	}
	
}
