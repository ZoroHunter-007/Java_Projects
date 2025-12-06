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
	
	public Card getById(int id) {
		return cardRepo.findById(id).orElse(null);
	}
	
	public void DeleteById(int id) {
		cardRepo.deleteById(id);
	}
	
	public Card updateData(int id, Card card) {
		Card c=cardRepo.findById(id).orElse(null);
		if(c!=null) {
			c.setCardNumber(card.getCardNumber());
			c.setStatus(card.getStatus());
			c.setCardType(card.getCardType());
			c.setCvv(card.getCvv());
			c.setExpiryDate(card.getExpiryDate());
			return cardRepo.saveAndFlush(c);
		}
		else {
			return null;
		}
	}
}
