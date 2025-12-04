package com.example.SpringBootBankApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
