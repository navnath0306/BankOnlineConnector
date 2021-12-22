package com.navnath.BankOnlineConnector.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.navnath.BankOnlineConnector.Domain.BankRequest;
import com.navnath.BankOnlineConnector.Domain.BankResponse;
import com.navnath.BankOnlineConnector.service.OnlineConnectorService;

@Service
public class OnlineConnectorServiceImpl implements OnlineConnectorService {

	@Autowired
	private RestTemplate restClient;

	private static String BASE_URL = "http://localhost:7070/";

	public String testConnection() {
		return restClient.getForObject(BASE_URL + "dummyBank/testConnectivity", String.class);
	}

	@Override
	public BankResponse authorize(BankRequest request) {

		BankResponse authorizeResponse = restClient.postForObject(BASE_URL + "dummyBank/authorize", request,
				BankResponse.class);

		return authorizeResponse;
	}
}
