package com.himanshi.rest.webservices.restfulwebservices;

public class HelloWorldBean{

	private String message;

	public String getMessage() {
		return message;
	}

	public HelloWorldBean(String message) {
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

}
