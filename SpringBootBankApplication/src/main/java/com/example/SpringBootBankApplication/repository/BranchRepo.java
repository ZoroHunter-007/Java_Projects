package com.example.SpringBootBankApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootBankApplication.entity.Branch;

@Repository
public interface BranchRepo extends JpaRepository<Branch, Integer>{

}
