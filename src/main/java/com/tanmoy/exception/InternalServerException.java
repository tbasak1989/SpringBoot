package com.tanmoy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalServerException extends CustomException{

	private static final long serialVersionUID = 1L;
	public InternalServerException(int errorCode, String errorMessage) {
		super(errorCode, errorMessage);
	}
}