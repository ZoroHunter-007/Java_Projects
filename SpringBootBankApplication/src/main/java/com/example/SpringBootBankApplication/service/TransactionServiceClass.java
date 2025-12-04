package com.example.SpringBootBankApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootBankApplication.entity.Transaction;
import com.example.SpringBootBankApplication.repository.TransactionRepo;

@Service
public class TransactionServiceClass {

	@Autowired
	private TransactionRepo transactionRepo;
	
	public Transaction SaveTransaction(Transaction tx) {
		return transactionRepo.save(tx);
	}
	
	public List<Transaction>showAll(){
		return transactionRepo.findAll();
	}
}
