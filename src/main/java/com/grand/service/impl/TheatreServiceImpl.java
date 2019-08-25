package com.grand.service.impl;

import org.springframework.stereotype.Service;

import com.grand.service.TheatreService;

/**
 * 
 * @author Laxman
 *
 */
@Service
public class TheatreServiceImpl implements TheatreService {/*

	@Autowired
	TheatreRepository theatreRepository;
	@Autowired
	MovieRepository movieRepository;
	@Autowired
	SeatRepository seatRepository;

	private static final Logger logger = LoggerFactory.getLogger(TheatreServiceImpl.class);

	public List<TheatreResponseDto> getAllTheatres(int movieId) {

		Movie movie = movieRepository.findByMovieId(movieId);
		List<Theatre> theatreslist = theatreRepository.findAll();
		List<TheatreResponseDto> theatreResponseDto = new ArrayList<>();
		if (theatreslist.size() != 0) {

			for (Theatre theatres : theatreslist) {
				TheatreResponseDto theatreResponseDto2 = new TheatreResponseDto();

				theatreResponseDto2.setMovieId(movie.getMovieId());
				theatreResponseDto2.setMovieName(movie.getMovieName());
				theatreResponseDto2.setPrice(movie.getPrice());
				theatreResponseDto2.setRestriction(movie.getRestricted());
				theatreResponseDto2.setTheatreId(theatres.getTheatreId());
				theatreResponseDto2.setTheatreName(theatres.getTheatreName());

				Seat seat = seatRepository.findByTheatreId(theatres.getTheatreId());

				if (seat!= null) {
					theatreResponseDto2.setAvaibleSeats(seat.getAvailableSeat());
					theatreResponseDto2.setTotalSeat(seat.getTotalSeat());
				} else {

					theatreResponseDto2.setAvaibleSeats(0);
					theatreResponseDto2.setTotalSeat(0);

				}
				
				theatreResponseDto.add(theatreResponseDto2);

			}
		}
		else {
	
				TheatreResponseDto theatreResponseDto2 = new TheatreResponseDto();

				theatreResponseDto2.setMovieId(movie.getMovieId());
				theatreResponseDto2.setMovieName(movie.getMovieName());
				theatreResponseDto2.setPrice(movie.getPrice());
				theatreResponseDto2.setRestriction(movie.getRestricted());
				theatreResponseDto2.setTheatreId(0);
				theatreResponseDto2.setTheatreName("NA");

				theatreResponseDto2.setAvaibleSeats(0);
				theatreResponseDto2.setTotalSeat(0);
				theatreResponseDto.add(theatreResponseDto2);
			}

		

		
		return theatreResponseDto;
	}
*/}