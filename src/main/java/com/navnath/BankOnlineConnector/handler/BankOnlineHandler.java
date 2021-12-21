package com.navnath.BankOnlineConnector.handler;

import org.springframework.stereotype.Component;

import com.navnath.BankOnlineConnector.Domain.BankRequest;
import com.navnath.BankOnlineConnector.Domain.PaymentPayloadRequest;
import com.navnath.BankOnlineConnector.Domain.PaymentPayloadResponse;

@Component
public abstract class BankOnlineHandler {
	
	public PaymentPayloadResponse process(PaymentPayloadRequest request) {
		BankRequest bankRequest = createRequest(request);

		return processResponse(bankRequest);
	}
	public abstract BankRequest createRequest(PaymentPayloadRequest request) ;
	public abstract PaymentPayloadResponse processResponse(BankRequest bankRequest);

}
