package com.navnath.BankOnlineConnector.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.navnath.BankOnlineConnector.Domain.AuthorizeRequest;
import com.navnath.BankOnlineConnector.Domain.AuthorizeResponse;
import com.navnath.BankOnlineConnector.service.OnlineConnectorService;

@Service
public class OnlineConnectorServiceImpl implements OnlineConnectorService{

	@Autowired
	private RestTemplate restClient;
	
	public String testConnection() {
		return restClient.getForObject("http://localhost:7070/dummyBank/testConnectivity", String.class);
	}

	@Override
	public AuthorizeResponse authorize(AuthorizeRequest request) {
		restClient.getForObject("", AuthorizeResponse.class);
		return null;
	}
}
