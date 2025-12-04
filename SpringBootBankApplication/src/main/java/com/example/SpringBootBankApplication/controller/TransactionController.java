package com.example.SpringBootBankApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootBankApplication.entity.Transaction;
import com.example.SpringBootBankApplication.service.TransactionServiceClass;

@RestController
@RequestMapping("/api/v3")
public class TransactionController {

	@Autowired
	private TransactionServiceClass transactionServiceClass;
	
	@PostMapping("/Transaction")
	public ResponseEntity<Transaction>saveTransactionData(@RequestBody Transaction tx){
		Transaction transaction=transactionServiceClass.SaveTransaction(tx);
		return ResponseEntity.ok(transaction);
	}
	
	@GetMapping("/ShowTransaction")
	public ResponseEntity<List<Transaction>>ShowAllTransactionData(){
		return ResponseEntity.ok(transactionServiceClass.showAll());
	}
}
