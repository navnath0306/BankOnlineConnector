package com.navnath.BankOnlineConnector.Domain;

public class BankRequest {

	private String type;
	private Header header;
	private Card card;
	private Merchant merchant;
	private Order order;
	private Transaction transaction;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

}
