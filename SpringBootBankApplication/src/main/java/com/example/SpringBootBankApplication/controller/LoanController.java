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
import com.example.SpringBootBankApplication.entity.Loan;
import com.example.SpringBootBankApplication.service.LoanServiceClass;

@RestController
@RequestMapping("/api/v3")
public class LoanController {

	@Autowired
	private LoanServiceClass loanServiceClass;
	
	@PostMapping("/Loan")
	public ResponseEntity<Loan>saveLoanData(@RequestBody Loan loan){
		Loan l=loanServiceClass.SaveLoan(loan);
		return ResponseEntity.ok(l);
	}
	
	@GetMapping("/ShowLoan")
	public ResponseEntity<List<Loan>>showAllLoanData(){
		return ResponseEntity.ok(loanServiceClass.showAll());
	}
	
	@GetMapping("/ShowLoan/{id}")
	public ResponseEntity<Loan>getLoanById(@PathVariable int id){
		Loan loan=loanServiceClass.getLoanDataById(id);
		if(loan!=null) {
			return ResponseEntity.ok(loan);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/ShowLoan/{id}")
	public ResponseEntity<Loan>DeleteById(@PathVariable int id){
		loanServiceClass.delById(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/UpdateLoan/{id}")
	public ResponseEntity<Loan>updateAccData(@RequestBody Loan loan, @PathVariable int id){
		Loan l=loanServiceClass.updateData(id, loan);
		if(l!=null) {
			return ResponseEntity.ok(l);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}

}
