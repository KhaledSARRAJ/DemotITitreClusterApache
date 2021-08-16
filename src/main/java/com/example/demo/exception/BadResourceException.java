package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadResourceException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public BadResourceException() {
	}

	public BadResourceException(String message) {
		super(message);
	}

	public BadResourceException(Throwable cause) {
		super(cause);
	}

	public BadResourceException(String message, Throwable cause) {
		super(message, cause);
	}

	public BadResourceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public void addErrorMessage(String string) {
		// TODO Auto-generated method stub
		
	}

}