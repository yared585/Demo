package com.cognizant.shapes;

class Father {

	void drive() {
		System.out.println("I drive car");
	}

}

class son extends Father {
	
	
	void drive() {

		System.out.println("I drive bike ");
	}

}

public class Manager06 {

	public static void main(String[] args) {
		son s1 = new son();
		s1.drive();
		
	}

}
