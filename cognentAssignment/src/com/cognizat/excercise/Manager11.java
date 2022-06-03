package com.cognizat.excercise;

class A063 {

	void test1() throws ClassNotFoundException {
		test3();
		System.out.println("test1:");

	}

	static void test2() {

		Manager11 m2 = new Manager11();
		m2.test4(); 
		System.out.println("test2"); 
	}

	void test3() throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.racleDriver");
		
		System.out.println("test3");
	}

}

public class Manager11 {

	public static void main(String[] args) throws ClassNotFoundException {

//		Manager11 m1 = new Manager11();
//		m1.test4();
		
		A063 A = new A063();
		A.test1();

	}

	void test4() {
		System.out.println("test4");

		A063.test2();

	}

}
