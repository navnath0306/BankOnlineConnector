package com.navnath.BankOnlineConnector.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.navnath.BankOnlineConnector.Domain.BankRequest;
import com.navnath.BankOnlineConnector.Domain.BankResponse;
import com.navnath.BankOnlineConnector.Domain.PaymentPayloadRequest;
import com.navnath.BankOnlineConnector.Domain.PaymentPayloadResponse;
import com.navnath.BankOnlineConnector.service.OnlineConnectorService;

@Component
public abstract class BankOnlineHandler {
	
	@Autowired
	private OnlineConnectorService service;
	
	public PaymentPayloadResponse process(PaymentPayloadRequest request) {
		BankRequest bankRequest = createRequest(request);
		BankResponse bankResponse = service.authorize(bankRequest);
		return processResponse(bankResponse);
	}
	public abstract BankRequest createRequest(PaymentPayloadRequest request) ;
	public abstract PaymentPayloadResponse processResponse(BankResponse bankRequest);

}
