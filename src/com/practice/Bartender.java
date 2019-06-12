package com.practice;

import java.util.concurrent.TimeUnit;

public class Bartender implements Runnable{
	
	public void run() {
		
		while(true) {
			if(Thread.interrupted()) {
				System.out.println("Bartender:zzz er erm, is someone waiting");
			}
			try {
				TimeUnit.SECONDS.sleep(5);
			}
			catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		
	}

}
