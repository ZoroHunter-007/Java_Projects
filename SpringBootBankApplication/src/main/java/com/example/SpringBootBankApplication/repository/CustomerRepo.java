package com.example.SpringBootBankApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootBankApplication.entity.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
