package com.dreams.Thread;

public class BasicTread implements Runnable{
	
	public BasicTread(String name) {
	}
	
	public static void main(String[] args) {
		BasicTread basicTread = new BasicTread("MIral");
		
		Thread thread = new Thread();
		thread.run();
	}

	public void run() {
		try {
			System.out.println("Miral Modi"+Thread.currentThread().getName());
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
