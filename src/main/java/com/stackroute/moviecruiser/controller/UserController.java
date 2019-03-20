package com.stackroute.moviecruiser.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
/*
 * @RequestMapping provides “routing” information. It tells Spring that any HTTP
 * request with the /api/v1 path should be mapped to this class
 */
@RequestMapping(path = "/api/v1")
@Slf4j
public class UserController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@GetMapping("/user")
	public ResponseEntity<String> fetchAllMovies() {
		logger.debug("This is a debug message");
		logger.info("This is an info message");
		logger.warn("This is a warn message");
		logger.error("This is an error message");
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}
}
