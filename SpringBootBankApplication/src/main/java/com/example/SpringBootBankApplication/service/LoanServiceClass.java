package com.example.SpringBootBankApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootBankApplication.entity.Loan;
import com.example.SpringBootBankApplication.repository.LoanRepo;

@Service
public class LoanServiceClass {

	@Autowired
	private LoanRepo loanRepo;
	
	public Loan SaveLoan(Loan loan) {
		return loanRepo.save(loan);
	}
	
	public List<Loan>showAll(){
		return loanRepo.findAll();
	}
}
