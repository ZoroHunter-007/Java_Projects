package com.example.SpringBootBankApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootBankApplication.entity.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer>{

	boolean existsByaccNumber(String accNumber);
	
}
