package com.grand.exception;

public class TheatresNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public TheatresNotFoundException(String message)
	{
		super(message);
	}

}
