package com.in28minutes.rest.webservices.restfulwebservices.JWTSecurity.resources;

public class AuthenticationException extends RuntimeException {
	public AuthenticationException(String message, Throwable cause) {
		super(message, cause);
	}
}
