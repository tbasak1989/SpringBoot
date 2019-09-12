package com.tanmoy.constant;

public enum ErrorEnum {

	DATABASE(0, "A database error has occured."), 
	DUPLICATE_USER(1, "This user already exists."),
	USER_NOT_FOUND(4040, "User Not Found."),
	USER_NOT_AUTHENTICATED(4010, "User Not Authebticated.");

	private final int errorCode;
	private final String errorMessage;

	private ErrorEnum(int errorCode, String errorMessage) {
		    this.errorCode = errorCode;
		    this.errorMessage = errorMessage;
		  }

	public String getErrorMessage() {
		return errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	@Override
	public String toString() {
		return errorCode + ": " + errorMessage;
	}
}
