package com.cognizat.calculator;

import java.util.Scanner;

public class ScannerLaptopDemo {

	int choice;
	public static void main(String[] args) {
		
	ScannerLaptopDemo s1 = new ScannerLaptopDemo();	

	do {
		
		System.out.println("Enter Option:");
		System.out.println("Add-1");
		System.out.println("Substrac-2");
		System.out.println("Multiply-3");
		System.out.println("Quit-4");

			
		Scanner scanner = new Scanner(System.in);
		 s1.choice = scanner.nextInt();

		switch (s1.choice) {

		case 1:
			System.out.println("Enter two numbers to be added");
			int Fnum = scanner.nextInt();
			int Snum = scanner.nextInt();

			int result = Fnum = Snum;

			System.out.println("The result is " + result);
			break;
		case 2: 
			System.out.println("Enter the two numbers to be substracted");
			int Fn = scanner.nextInt();
			int Sn = scanner.nextInt();
			
			int R = Fn-Sn;
			System.out.println("The result is "+ R);
			break;
		case 3:	
			System.out.println("Enter the two number to be multiplied");
			int num = scanner.nextInt();
			int num2 = scanner.nextInt();
			
			int res = num*num2;
			
			System.out.println("The result is "+ res);
			break;
		
		
		
		}

	}while(s1.choice !=4);
		
	}
}
