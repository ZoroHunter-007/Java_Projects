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
	
	public Loan getLoanDataById(int id) {
		return loanRepo.findById(id).orElse(null);
	}
	
	public void delById(int id) {
		loanRepo.deleteById(id);
	}
	
	public Loan updateData(int id, Loan loan) {
		Loan l=loanRepo.findById(id).orElse(null);
		if(l!=null) {
			l.setLoanAmount(loan.getLoanAmount());
			l.setLoanType(loan.getLoanType());
			l.setRate(l.getRate());
			l.setStatus(loan.getStatus());
			l.setStartDate(loan.getStartDate());
			l.setEndDate(loan.getEndDate());
			return loanRepo.saveAndFlush(l);
		}
	
		else {
			return null;
		}
	}
}
