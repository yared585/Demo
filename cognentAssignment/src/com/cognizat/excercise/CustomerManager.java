package com.cognizat.excercise;



import java.util.Scanner;

class Customer {
	private int cid;
	private String name;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer(int cid, String name) {
		this.cid = cid;
		this.name = name;
	}

	@Override
	public String toString() {

		return "The customer id: "+cid + " customer name: " + name + " ";

	}

}

public class CustomerManager {

	public static void main(String[] args) {
		
		System.out.println("Please Enter how many customer you want to enter");
		
		Scanner scanner = new Scanner(System.in);
		int CustomerSize =  scanner.nextInt();
		
		Customer [] customers = new Customer[CustomerSize];
		
		
		
		for(int i =0; i < CustomerSize; i++) {
			System.out.println("Please enter Customer id");
			
				
			int cid = scanner.nextInt();
			
			
			System.out.println("Please enter Customer name");
			String cName = scanner.next();
			
			Customer customer = new Customer(cid, cName); 
			
			customers[i]= customer;
								
			
		}
		
		for(int i=0; i < customers.length; i++) {
			
			System.out.println(customers[i]);
		
		
		
		
		}
	}

}
