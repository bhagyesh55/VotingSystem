package com.example.practice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(value=VoterNotFoundException.class)
	public ResponseEntity<String> VoterNotFoundExceptionHandler(VoterNotFoundException ex){
		return new ResponseEntity<String> (ex.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=ContestantNotFoundException.class)
	public ResponseEntity<String> ContestantNotFoundExceptionHandler(ContestantNotFoundException ex){
		return new ResponseEntity<String> (ex.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	

}
