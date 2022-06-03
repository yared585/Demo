package com.cogent.core.threads;

class MyThread extends Thread {

	@Override
	public void run() {
		// Task2
		for (int i = 100; i <= 200; i++) {
			System.out.println("Loop2: " + i);

		}

	}

}

public class Manager_Thread {

	public static void main(String[] args) {

		MyThread thread = new MyThread();
		thread.start();
		
		//Task 1
		for (int i = 0; i <= 100; i++) {
			System.out.println(" Loop1: " + i);

		}

	}

}
