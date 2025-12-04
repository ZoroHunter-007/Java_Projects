package com.example.SpringBootBankApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
