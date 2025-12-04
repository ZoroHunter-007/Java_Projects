package com.example.SpringBootBankApplication.repository;

import com.example.SpringBootBankApplication.entity.CustomerEmail;

public interface EmailService {

	public String sendMail(CustomerEmail custEmail);
}
