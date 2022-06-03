package com.cognizant.shapes;

import java.util.Scanner;

class Shapess {

	int numberOfSides;

	void calculateShapeArea(int shapes, int sidelength) {

		numberOfSides = shapes;

		switch (numberOfSides) {

		case 1:

			Circle newCirecle = new Circle();
			newCirecle.calculateArea(sidelength);
			break;
		case 3:

			Triangle newTriangle = new Triangle();
			newTriangle.calculateArea(sidelength);
			break;
		case 4:

			Square newSquare = new Square();
			newSquare.calculateArea(sidelength);
			break;
		default:

			System.out.println("Number of Shapes is not Present");
		}
	}

}

public class AssignmenSwitchCase {
	
	public static void main(String[] args) {
	
		Shapess newshap = new Shapess();
		
		Scanner scn = new Scanner(System.in);
	    System.out.println("Please enter the shape value  shapes for the Switch assignrmnt");
		int shapes = scn.nextInt();
		System.out.println("Please enter the sidelength for the switch assignment");
		
		int sidelength = scn.nextInt();
		
		newshap.calculateShapeArea(shapes, sidelength);
		
	}
	
}
