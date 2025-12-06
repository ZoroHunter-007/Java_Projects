package com.example.SpringBootBankApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootBankApplication.entity.Account;
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
	
	public Branch getDataById(int id) {
		return branchRepo.findById(id).orElse(null);
	}
	
	public void DelById(int id) {
		branchRepo.deleteById(id);
	}
	
	public Branch updateData(int id, Branch branch) {
		Branch updateBranch=branchRepo.findById(id).orElse(null);
		if(updateBranch!=null) {
			updateBranch.setBranchName(branch.getBranchName());
			updateBranch.setIfscCode(branch.getIfscCode());
			updateBranch.setLocation(branch.getLocation());
			return branchRepo.saveAndFlush(updateBranch);
		}
		else {
			return null;
		}
	}
}
