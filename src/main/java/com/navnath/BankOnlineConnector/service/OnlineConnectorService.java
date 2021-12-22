package com.navnath.BankOnlineConnector.service;

import org.springframework.stereotype.Service;

import com.navnath.BankOnlineConnector.Domain.BankRequest;
import com.navnath.BankOnlineConnector.Domain.BankResponse;

@Service
public interface OnlineConnectorService {
	public String testConnection();
	public BankResponse authorize(BankRequest request);
	
}
