package com.grand.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grand.dto.MovieResponseDto;
import com.grand.entity.Movie;
import com.grand.entity.MovieTheatre;
import com.grand.exception.NoMovieAvailableException;
import com.grand.repository.MovieRepository;
import com.grand.repository.MovieTheatreRepository;
import com.grand.service.MovieService;

/**
 * @author Laxman
 *
 */
@Service
public class MovieServiceImpl implements MovieService {
	private static final Logger logger = LoggerFactory.getLogger(MovieServiceImpl.class);
	@Autowired
	MovieTheatreRepository movieTheatreRepository;

	@Autowired
	MovieRepository movieRepository;

	@Override
	public List<MovieResponseDto> getListMovieByBookDate(String bookDate) {
		logger.info("inside getListMovieByBookDate method of MovieServiceImpl class");
		// create list of movie id
		// get movieId based on book date

		List<MovieResponseDto> response = new ArrayList<>();
		
		logger.info("bookDate ={}", bookDate);
		List<MovieTheatre> movieTheatreList = movieTheatreRepository.findByShowDate(bookDate);
		logger.info("movieTheatre size ={}", movieTheatreList.size());
		System.out.println("movieTheatre :: "+movieTheatreList);
	
		if (movieTheatreList != null) {
			response = new ArrayList<MovieResponseDto>();
			for (MovieTheatre movieTheatre : movieTheatreList) {
				MovieResponseDto responseDto = new MovieResponseDto();
				responseDto.setMovieId(movieTheatre.getMovie().getMovieId());
				responseDto.setMovieName(movieTheatre.getMovie().getMovieName());
				responseDto.setRestricted(movieTheatre.getMovie().getRestricted());
				responseDto.setViewLink(movieTheatre.getMovie().getViewLink());
				responseDto.setPrice(movieTheatre.getTheatre().getPrice());
				response.add(responseDto);
			}
		} else {
			throw new NoMovieAvailableException("No Movie available");
		}
		return response;
	}

}
