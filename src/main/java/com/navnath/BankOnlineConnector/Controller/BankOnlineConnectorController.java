package com.navnath.BankOnlineConnector.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.navnath.BankOnlineConnector.Domain.PaymentPayloadRequest;
import com.navnath.BankOnlineConnector.Domain.PaymentPayloadResponse;
import com.navnath.BankOnlineConnector.handler.BankOnlineHandler;

@RestController
public class BankOnlineConnectorController {
	@Autowired
	private BankOnlineHandler handler;
	
	@GetMapping("/testConnectivity")
	public String testConnectivity() {
		return "SUCCESS";
	}
	@PostMapping("/transaction/authorize")
	public PaymentPayloadResponse authorize(@RequestBody PaymentPayloadRequest request) {
		PaymentPayloadResponse paymentPayloadResponse = handler.process(request);
		return paymentPayloadResponse;
	}
}
