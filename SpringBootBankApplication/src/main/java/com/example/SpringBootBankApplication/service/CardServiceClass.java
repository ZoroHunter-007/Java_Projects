package com.example.SpringBootBankApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootBankApplication.entity.Card;
import com.example.SpringBootBankApplication.repository.CardRepo;

@Service
public class CardServiceClass {

	@Autowired
	private CardRepo cardRepo;
	
	public Card SaveCard(Card card) {
		return cardRepo.save(card);
	}
	
	public List<Card>showAll(){
		return cardRepo.findAll();
	}
}
