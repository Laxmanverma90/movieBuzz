package com.grand.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class BookMovieResponeDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int statusCode;
	private String message;
}
