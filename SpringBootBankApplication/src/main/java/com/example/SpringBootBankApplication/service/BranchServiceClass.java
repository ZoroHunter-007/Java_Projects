package com.example.SpringBootBankApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootBankApplication.entity.Branch;
import com.example.SpringBootBankApplication.repository.BranchRepo;

@Service
public class BranchServiceClass {

	@Autowired
	private BranchRepo branchRepo;
	
	public Branch saveBranch(Branch branch) {
		return branchRepo.save(branch);
	}
	
	public List<Branch>showAllData(){
		return branchRepo.findAll();
		
	}
}
