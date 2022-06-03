package com.cognizant.shapes;

class Circle {
	  
	  
	void calculateArea(int radius) {
		
		double area = 3.14 * radius*radius;
		
		System.out.println("The area of the Circle is " + area);
		
	}

}

class Square {

	
	void calculateArea(int sides) {
		
		int area = sides * sides;
		
		System.out.println("The area of the Square is  " + area);
		

	}
}

class Triangle {
	
	void calculateArea(int sides) {
		
		double area = 0.43 * sides * sides; 
		System.out.println("The are of the Triangle is   " + area);

	}

}