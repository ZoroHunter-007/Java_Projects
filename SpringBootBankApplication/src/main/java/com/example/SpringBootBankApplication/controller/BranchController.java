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
import com.example.SpringBootBankApplication.entity.Branch;
import com.example.SpringBootBankApplication.service.BranchServiceClass;

@RestController
@RequestMapping("/api/v3/")
public class BranchController {

	@Autowired
	private BranchServiceClass branchServiceClass;
	
	@PostMapping("/Branch")
	public ResponseEntity<Branch>SaveBranchData(@RequestBody Branch branch){
		Branch b=branchServiceClass.saveBranch(branch);
		return ResponseEntity.ok(b);
	}
	
	@GetMapping("/ShowBranch")
	public ResponseEntity<List<Branch>>showAllBranchData(){
		return ResponseEntity.ok(branchServiceClass.showAllData());
	}
	@GetMapping("/ShowBranch/{id}")
	public ResponseEntity<Branch>getBranchById(@PathVariable int id){
		Branch b=branchServiceClass.getDataById(id);
		if(b!=null) {
			return ResponseEntity.ok(b);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/ShowBranch/{id}")
	public ResponseEntity<Branch>DeleteBraanchById(@PathVariable int id){
		branchServiceClass.DelById(id);
		return ResponseEntity.noContent().build();
	}
	@PutMapping("/UpdateBranch/{id}")
	public ResponseEntity<Branch>updateAccData(@RequestBody Branch branch, @PathVariable int id){
		Branch b=branchServiceClass.updateData(id, branch);
		if(b!=null) {
			return ResponseEntity.ok(b);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
}
