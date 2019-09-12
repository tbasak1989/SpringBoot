package com.tanmoy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFound extends CustomException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFound(int errorCode, String errorMessage) {
		super(errorCode, errorMessage);
	}
}
