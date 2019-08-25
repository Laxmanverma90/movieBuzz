package com.grand.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

@CrossOrigin(allowedHeaders = { "*", "/" }, origins = { "*", "/" })

public class BookTicketController {/*

	@Autowired
	private BookTicketService bookTicketService;
	
	public static final Logger logger = LoggerFactory.getLogger(BookTicketController.class);
	
	@PostMapping("/book")
	public ResponseEntity<BookMovieResponeDto> bookTicket(@RequestBody BookMyMovieDto bookMyMovieDto)
	{
		logger.info("in bookTicket controller");
		
		return new ResponseEntity<>(bookTicketService.bookMovie(bookMyMovieDto),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/viewTicket", method = RequestMethod.GET)
	public ResponseEntity<List<MyMovieResponseDto>> getBookedMovies(){
		return new ResponseEntity<>(bookTicketService.getBookedMovies(), HttpStatus.OK);
	}
	
*/}
