package com.example.practice.exception;

public class ContestantNotFoundException extends RuntimeException {
	
	public ContestantNotFoundException() {
		super();
	}
	
	public ContestantNotFoundException(String message) {
		super(message);
	}

}
