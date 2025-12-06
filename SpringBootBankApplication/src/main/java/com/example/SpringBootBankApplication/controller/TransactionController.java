package com.example.SpringBootBankApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootBankApplication.entity.Account;
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
	
	@GetMapping("/ShowTransaction/{id}")
	public ResponseEntity<Transaction>getTxById(@PathVariable int id){
		Transaction tx=transactionServiceClass.getDataTxById(id);
		if(tx!=null) {
			return ResponseEntity.ok(tx);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/ShowTransaction/{id}")
	public ResponseEntity<Transaction>DeleteDataById(@PathVariable int id){
		transactionServiceClass.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/UpdateTransaction/{id}")
	public ResponseEntity<Transaction>updateAccData(@RequestBody Transaction transaction, @PathVariable int id){
		Transaction tx=transactionServiceClass.updateData(id, transaction);
		if(tx!=null) {
			return ResponseEntity.ok(tx);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
}
