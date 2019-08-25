package com.grand.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
@CrossOrigin(allowedHeaders = { "*", "/" }, origins = { "*", "/" })
public class TheatreController {/*
	
	private static final Logger logger = LoggerFactory.getLogger(TheatreController.class);
	@Autowired
	TheatreService theatreService;

	
	@GetMapping("/theatres/{movieId}")
	public ResponseEntity<List<TheatreResponseDto>>getAllTheatres(@PathVariable int movieId)
	{
		logger.info("inside getAvailableSeat method of TheatreController class");
      List<TheatreResponseDto> listOfTheatres = theatreService.getAllTheatres(movieId);
       return new ResponseEntity<List<TheatreResponseDto>>(listOfTheatres, HttpStatus.OK);
	}
	
	

*/}
