package com.tanmoy.exception;

import java.util.Date;

public class ExceptionResponse {
	private Date timestamp;
	private Integer errorCode;
	private String errorMessage;
	private String details;

	public ExceptionResponse(Date timestamp, Integer errorCode, String errorMessage, String details) {
		super();
		this.setTimestamp(timestamp);
		this.setErrorCode(errorCode);
		this.setErrorMessage(errorMessage);
		this.setDetails(details);
	}
	
	public ExceptionResponse(Date timestamp, String errorMessage, String details) {
		super();
		this.setTimestamp(timestamp);
		this.setErrorMessage(errorMessage);
		this.setDetails(details);
	}
	
	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
