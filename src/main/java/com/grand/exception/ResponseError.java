package com.grand.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Laxman
 *
 */
@Getter
@Setter
public class ResponseError {
	private String message;
	private Integer statusCode;

	public ResponseError(String message, Integer statusCode) {
		this.message = message;
		this.statusCode = statusCode;
	}
}
