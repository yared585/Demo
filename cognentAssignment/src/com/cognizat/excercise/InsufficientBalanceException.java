package com.cognizat.excercise;

public class InsufficientBalanceException extends ArithmeticException {

	public InsufficientBalanceException () {
		super();
		
	}
	
	public InsufficientBalanceException (String s) {
		super(s);
	}
	
}
