package com.navnath.BankOnlineConnector.Domain;

public enum TransactionType {
	AUTHORIZE("Authorize"),
	CAPTURE("Capture"),
	CANCEL("Cancel"),
	DEBIT("Debit");
	
	String name;
	TransactionType(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
