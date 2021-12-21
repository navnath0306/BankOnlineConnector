package com.navnath.BankOnlineConnector.service.imp;

import org.springframework.stereotype.Component;

import com.navnath.BankOnlineConnector.Domain.AuthType;
import com.navnath.BankOnlineConnector.Domain.AuthorizeRequest;
import com.navnath.BankOnlineConnector.Domain.Card;
import com.navnath.BankOnlineConnector.Domain.Header;
import com.navnath.BankOnlineConnector.Domain.Merchant;
import com.navnath.BankOnlineConnector.Domain.Order;
import com.navnath.BankOnlineConnector.Domain.PaymentPayloadRequest;
import com.navnath.BankOnlineConnector.Domain.Transaction;

@Component
public class RequestBuilder {
	
	public AuthorizeRequest authorizeRequest(PaymentPayloadRequest request) {
		AuthorizeRequest authorizeRequest = new AuthorizeRequest();
		authorizeRequest.setAuthType(AuthType.AUTHORIZE.getAuthType());
		authorizeRequest.setCard(buildCard(request));
		authorizeRequest.setHeader(buildHeader(request));
		authorizeRequest.setMerchant(buildMerchant(request));
		authorizeRequest.setOrder(buildOrder(request));
		authorizeRequest.setTransaction(buildTransaction(request));
		authorizeRequest.setType(request.getTransactionType().getName());
		
		return authorizeRequest;
	}
	public static Card buildCard(PaymentPayloadRequest request) {
		Card card = new Card();
		card.setCardNumber(request.getCardNumber());
		card.setCvv(request.getCvv());
		card.setExpiryDate(request.getExpiryDate());
		return card;
	}
	public static Header buildHeader(PaymentPayloadRequest request) {
		Header header = new Header();
		header.setTransactionId(request.getTransactionId());
		return header;
	}
	public static Merchant buildMerchant(PaymentPayloadRequest request) {
		Merchant merchant = new Merchant();
		merchant.setMerchantId(request.getMerchantId());
		merchant.setMerchantName(request.getMerchantName());
		return merchant;
	}
	public static Order buildOrder(PaymentPayloadRequest request) {
		Order order = new Order();
		order.setOrderDesc(request.getOrderDesc());
		order.setOrderId(request.getOrderId());
		
		return order;
	}
	public static Transaction buildTransaction(PaymentPayloadRequest request) {
		Transaction transaction =  new Transaction();
		transaction.setAmount(request.getAmount());
		transaction.setChannel(request.getChannel());
		transaction.setTime(request.getTime());
		transaction.setTransactionId(request.getTransactionId());
		return transaction;
	}

}
