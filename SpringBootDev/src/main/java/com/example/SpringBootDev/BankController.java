package com.example.SpringBootDev;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class BankController {
	
	@Autowired
	private BankService bankService;
	
	@PostMapping("/Bank")
	public ResponseEntity<Bank> saveBank(@RequestBody Bank b ){
		Bank newBank=bankService.SaveBankData(b);
		return ResponseEntity.ok(newBank);
	}
	@GetMapping("/Bank")
	public ResponseEntity<List<Bank>> Findall(@RequestBody Bank b ){
		return ResponseEntity.ok(bankService.FindAllData());
	}

}
