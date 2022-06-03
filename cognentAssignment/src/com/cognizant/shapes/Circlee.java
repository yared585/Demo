package com.cognizant.shapes;

public class Circlee {

	private float radius;
	 float pi;
	
	
	// Constructor 1
	public Circlee() {

		radius = 1.5f;
		pi = 3.5f;
	}
	
	// constructor 2
	 public Circlee(float radius) {
		this.radius = radius;
	}
	
	// constructor 3
	private Circlee(float radius, float pi) {
		
		this.radius = radius;
		this.pi = pi;
	}
	
	@Override
	
	public String toString() {
		
		return radius+" "+ pi+" ";
	}

	void calculateCircleArea(float r) {
		
		float A = 3.14f*r*r;
		
		System.out.println("The area of the circle is "+ A);
		
	}
	
	static void calculateCircumference(float r ) {
		
		float c = 2*3.14f*r;
		
		System.out.println("The circumfrance of the circle is "+ c);
	}
	
	public static void main(String[] args) {
		
		Circlee c3 =new Circlee(2.4f, 4.3f);
		 
		System.out.println(c3);
		
//		c3.calculateCircleArea(6);
//		c3.calculateCircumference(7);
		
		new Circlee().calculateCircleArea(6);
		Circlee.calculateCircumference(4);
		
	}

}
