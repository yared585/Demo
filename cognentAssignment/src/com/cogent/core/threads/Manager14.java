package com.cogent.core.threads;

class Thread091 extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}
class Thread092 extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}

public class Manager14 {
public static void main(String[] args) {
	
	Thread091 t1 = new Thread091();
	t1.setName("Jack");
	Thread092 t2 = new Thread092();
	t2.setName("Jamie");
	
	t1.run();
	t2.run();
	
	System.out.println(Thread.currentThread().getName());
}
	
}
