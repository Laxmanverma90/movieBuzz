package com.grand.service;

import java.util.List;

import com.grand.dto.MovieResponseDto;

/**
 * @author Laxman
 *
 */
public interface MovieService {
	
	public List<MovieResponseDto> getListMovieByBookDate(String  bookDate);

}
