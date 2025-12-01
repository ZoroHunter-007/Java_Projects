package com.example.SpringBootDev;

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
	public ResponseEntity<List<Bank>> Findall(){
		return ResponseEntity.ok(bankService.FindAllData());
	}
	
	@GetMapping("/Bank/{id}")
	public ResponseEntity<Bank>getDataById(@PathVariable int id){
		Bank bankrepo=bankService.getById(id);
		if(bankrepo!=null) {
			return ResponseEntity.ok(bankrepo);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	@PutMapping("Bank/{id}")
	public ResponseEntity<Bank>updateData(@PathVariable int id,@RequestBody Bank bank){
		Bank updateBank=bankService.updateBank(id, bank);
		if(updateBank!=null) {
			return ResponseEntity.ok(updateBank);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	@DeleteMapping("Bank/{id}")
	public ResponseEntity<Bank> DeleteData(@PathVariable int id){
		
		bankService.DeleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping("Banks")
	public ResponseEntity<List<Bank>>addmulData(@RequestBody List<Bank> bank){
		List<Bank> b=bankService.addmulBankData(bank);
		return ResponseEntity.ok(b);
	}

}
