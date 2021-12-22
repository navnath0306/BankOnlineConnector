package com.navnath.BankOnlineConnector.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.navnath.BankOnlineConnector.Domain.AuthorizeResponse;
import com.navnath.BankOnlineConnector.Domain.BankRequest;
import com.navnath.BankOnlineConnector.Domain.BankResponse;
import com.navnath.BankOnlineConnector.Domain.PaymentPayloadRequest;
import com.navnath.BankOnlineConnector.Domain.PaymentPayloadResponse;
import com.navnath.BankOnlineConnector.service.imp.RequestBuilder;

@Component
public class AuthorizeHandler extends BankOnlineHandler {

	@Autowired
	RequestBuilder requestBuilder;

	@Override
	public BankRequest createRequest(PaymentPayloadRequest request) {
		return requestBuilder.authorizeRequest(request);
	}

	@Override
	public PaymentPayloadResponse processResponse(BankResponse bankRequest) {
		PaymentPayloadResponse paymentPayloadResponse = new PaymentPayloadResponse();
		
		paymentPayloadResponse.setApprovalStatus(bankRequest.getStatus());
		paymentPayloadResponse.setTransactionId(Long.valueOf(bankRequest.getTransactionId()));
		paymentPayloadResponse.setResponseCode(bankRequest.getResponseCode());

		return paymentPayloadResponse;
	}

}
