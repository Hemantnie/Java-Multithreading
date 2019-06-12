package com.practice;

import java.util.concurrent.TimeUnit;

public class Customer implements Runnable{
	
	Thread bartenderThread;
	String name;
	int waitTime;

	public Customer(Thread bartenderThread, String name, int waitTime) {
		super();
		this.bartenderThread = bartenderThread;
		this.name = name;
		this.waitTime = waitTime;
	}


	public void run() {
		System.out.println(name+"Does not seem to be anyone around. I'll wait a moment");
		try {
			TimeUnit.SECONDS.sleep(waitTime);
		}catch(InterruptedException e) {
			
		}
		System.out.println("Oh there is a bell");
		bartenderThread.interrupt();
		
	}

}
