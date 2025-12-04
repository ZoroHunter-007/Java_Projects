package com.example.SpringBootBankApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootBankApplication.entity.Loan;

@Repository
public interface LoanRepo extends JpaRepository<Loan, Integer>{

}
