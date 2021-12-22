package com.navnath.BankOnlineConnector.Domain;

public class AuthorizeResponse {
	private String transactionId;
	private String status;
	private String message;
	private Long responseCode;
	private ResponseDetails responseDetails;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Long responseCode) {
		this.responseCode = responseCode;
	}

	public ResponseDetails getResponseDetails() {
		return responseDetails;
	}

	public void setResponseDetails(ResponseDetails responseDetails) {
		this.responseDetails = responseDetails;
	}

}
