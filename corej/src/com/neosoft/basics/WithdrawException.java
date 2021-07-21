package com.neosoft.basics;

public class WithdrawException extends Exception {
	String message;

	public WithdrawException(String message) {
		// TODO Auto-generated constructor stub
		this.message=message;
		
		
	}
	public WithdrawException(Throwable cause ,String message) {
		// TODO Auto-generated constructor stub
		super(cause);
		this.message=message;
		
		
	}
	public String getMessage() {
		return message;
	}
	}

	
