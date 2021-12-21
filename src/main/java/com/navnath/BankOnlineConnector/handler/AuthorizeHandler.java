package com.navnath.BankOnlineConnector.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.navnath.BankOnlineConnector.Domain.BankRequest;
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
	public PaymentPayloadResponse processResponse(BankRequest bankRequest) {
		PaymentPayloadResponse paymentPayloadResponse = new PaymentPayloadResponse();
		paymentPayloadResponse.setApprovalStatus("Approved");
		paymentPayloadResponse.setResponseCode("00");
		paymentPayloadResponse.setTransactionId(123456l);

		return paymentPayloadResponse;
	}

}
