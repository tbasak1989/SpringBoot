package com.tanmoy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UnauthorizedException extends CustomException{

	private static final long serialVersionUID = 1L;

	public UnauthorizedException(int errorCode, String errorMessage) {
		super(errorCode, errorMessage);
	}
}
