package com.example.SpringBootDev;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {

	@Autowired
	private BankRepository bankrepository;
	
	//insert data
	public Bank SaveBankData(Bank b) {
		return bankrepository.saveAndFlush(b);
	}
	
	//get all data
	public List<Bank> FindAllData(){
		return bankrepository.findAll();
	}
	
	//get data by id
	public Bank getById(int id) {
		
		return bankrepository.findById(id).orElse(null);
		
	}
	
	//update data
	public Bank updateBank(int id, Bank bank) {
		Bank existingBank=bankrepository.findById(id).orElse(null);
		if(existingBank!=null) {
			existingBank.setAccountId(bank.getAccountId());
			existingBank.setAccountHolderName(bank.getAccountHolderName());
			existingBank.setAccountNumber(bank.getAccountNumber());
			existingBank.setBalance(bank.getBalance());
			return bankrepository.saveAndFlush(existingBank);
		}
		else {
			return null;
		}
	}
	
	//delete data by id
	public void DeleteById(int id) {
		bankrepository.deleteById(id);
	}
	
	//add multiple entries
	public List<Bank> addmulBankData(List<Bank> banks){
		return bankrepository.saveAll(banks);
	}
}
