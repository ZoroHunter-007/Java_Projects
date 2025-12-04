package com.example.SpringBootBankApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootBankApplication.entity.Account;
import com.example.SpringBootBankApplication.service.AccountServiceClass;

@RestController
@RequestMapping("/api/v3/")
public class AccountController {

	@Autowired
	private AccountServiceClass accountServiceClass;
	
	@PostMapping("/Account")
	public ResponseEntity<Account>SaveAccountData(@RequestBody Account ac){
		Account account=accountServiceClass.SaveAccount(ac);
		return ResponseEntity.ok(account);
	}
}
