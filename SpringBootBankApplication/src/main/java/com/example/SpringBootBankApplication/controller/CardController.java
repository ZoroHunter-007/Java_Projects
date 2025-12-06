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
import com.example.SpringBootBankApplication.entity.Card;
import com.example.SpringBootBankApplication.service.CardServiceClass;

@RestController
@RequestMapping("/api/v3/")
public class CardController {

	@Autowired
	private CardServiceClass cardServiceClass;
	
	@PostMapping("/Card")
	public ResponseEntity<Card>saveCardData(@RequestBody Card card){
		
		Card c=cardServiceClass.SaveCard(card);
		return ResponseEntity.ok(c);
	}

	@GetMapping("/ShowCard")
	public ResponseEntity<List<Card>>showAllCardData(){
		return ResponseEntity.ok(cardServiceClass.showAll());
	}
	
	@GetMapping("/ShowCard/{id}")
	public ResponseEntity<Card>getCardById(@PathVariable int id){
		Card card=cardServiceClass.getById(id);
		if(card!=null) {
			return ResponseEntity.ok(card);
			
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	@DeleteMapping("/ShowCard/{id}")
	public ResponseEntity<Card>DeleteDataById(@PathVariable int id){
		cardServiceClass.DeleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/UpdateCard/{id}")
	public ResponseEntity<Card>updateAccData(@RequestBody Card card, @PathVariable int id){
		Card c=cardServiceClass.updateData(id, card);
		if(c!=null) {
			return ResponseEntity.ok(c);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
}
