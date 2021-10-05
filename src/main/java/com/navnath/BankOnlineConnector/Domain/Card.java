package com.navnath.BankOnlineConnector.Domain;

public class Card {
	private String cardNumber;
	private ExpiryDate expiryDate;
	private String cvv;
	private boolean isPresent;
	public boolean isPresent() {
		return isPresent;
	}
	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public ExpiryDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(ExpiryDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	

}
