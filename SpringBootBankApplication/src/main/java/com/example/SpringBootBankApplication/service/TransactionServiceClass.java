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
	
	public Transaction getDataTxById(int id) {
		return transactionRepo.findById(id).orElse(null);
	}
	public void deleteById(int id) {
		transactionRepo.deleteById(id);
	}
	
	public Transaction updateData(int id, Transaction transaction) {
		Transaction tx=transactionRepo.findById(id).orElse(null);
		if(tx!=null) {
			tx.setAmount(transaction.getAmount());
			tx.setDescription(transaction.getDescription());
			tx.setTransactionType(transaction.getTransactionType());
			return transactionRepo.saveAndFlush(tx);
		}
		else {
			return null;
		}
	}
}
