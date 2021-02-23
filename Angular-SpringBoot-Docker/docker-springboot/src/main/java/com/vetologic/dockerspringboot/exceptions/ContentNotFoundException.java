package com.vetologic.dockerspringboot.exceptions;

public class ContentNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ContentNotFoundException(String errorMessage) {
		super(errorMessage);
	}
}
