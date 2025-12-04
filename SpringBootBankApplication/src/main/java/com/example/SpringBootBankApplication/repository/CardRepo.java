package com.example.SpringBootBankApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootBankApplication.entity.Card;

@Repository
public interface CardRepo extends JpaRepository<Card, Integer>{

}
