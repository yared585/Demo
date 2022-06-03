package com.cognizant.shapes;
class A {

	int y;

	void test1() {

		y = 9;
		System.out.println("test1");
		
		Manager05 newMa = new Manager05();
		newMa.test4();
	}

	void test2() {
		Manager05 c = new Manager05();
		c.test5();
		
		
		Manager05.test5();

		System.out.println("test2");
	}

	static void test3() {

		A newA = new A();
		newA.y = 9;

		System.out.println("test3");
	}

}

public class Manager05 {
	int i = 89;
	void test4() {
		System.out.println("test4");
		
	}
	
	static void test5() {
		
		System.out.println("test5");
		A newB = new A();
		
		newB.test1();
		newB.test2();
		newB.test3();
		
		
	}

	public static void main(String[] args) {

		
		Manager05 mane = new Manager05();
		Manager05 mane1 = new Manager05();
		
		mane.test4();
		new Manager05().test5();
		Manager05.test5();
	
		
		System.out.println(mane.i);
		
		
		
	}

}
