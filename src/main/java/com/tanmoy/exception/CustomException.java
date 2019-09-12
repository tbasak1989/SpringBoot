package com.tanmoy.exception;

public class CustomException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private int errorCode;
	private String errorMessage;

	public CustomException(int errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}
}
