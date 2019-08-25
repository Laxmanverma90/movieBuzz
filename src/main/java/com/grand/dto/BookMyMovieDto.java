package com.grand.dto;

import java.io.Serializable;

import lombok.Data;


@Data
public class BookMyMovieDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int movieId;
	private int theatreId;
	private String bookDate;
	private String emailId;
	private double price;
	private int totalSeat;
	
}

