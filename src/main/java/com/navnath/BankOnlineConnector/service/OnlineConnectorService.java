package com.navnath.BankOnlineConnector.service;

import org.springframework.stereotype.Service;

import com.navnath.BankOnlineConnector.Domain.AuthorizeRequest;
import com.navnath.BankOnlineConnector.Domain.AuthorizeResponse;

@Service
public interface OnlineConnectorService {
	public String testConnection();
	public AuthorizeResponse authorize(AuthorizeRequest request);
	
}
