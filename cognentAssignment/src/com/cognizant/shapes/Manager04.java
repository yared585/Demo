package com.cognizant.shapes;

import java.util.Scanner;

class Shapes {

	int numberOfSides;

	void calculateShapeArea(int shapes, int sidelength) {
			 
		numberOfSides = shapes;
		
		if (numberOfSides == 1) {

			Circle newCircle = new Circle();
			newCircle.calculateArea(sidelength);
			

		} else if  (numberOfSides == 3) {

			Triangle newTriangle = new Triangle();
			newTriangle.calculateArea(sidelength);
			
		}else if (numberOfSides == 4) {
			Square newSqure = new Square();
			newSqure.calculateArea(sidelength);
			
		}else{
			
			System.out.println("Number of Shape is not present ");
		}
	
			
	}

}

public class Manager04 {
	
	public static void main(String[] args) {
		
		Shapes newshapes = new Shapes();
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Please enter number of the shapes");
		int shapes = scanner.nextInt();
		System.out.println("Please enter the value of side length");
		int sidelength = scanner.nextInt();
		newshapes.calculateShapeArea(shapes, sidelength);
		
		
	}

}
