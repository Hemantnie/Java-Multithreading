package com.practice;

public class RealHelloWorldSingleThreaded {
	
	public static class Greeter implements Runnable{
		private String country;
		public Greeter(String country) {
			this.country = country;
		}
		public void run() {
			try {
				Thread.sleep(10000);
			}catch(InterruptedException e) {
				
			}
			System.out.println("Hello "+country+"!");
		}
	}

	public static void main(String[] args) {
		String countries[] = {"France","India","China","USA","Germany"};
		
		for(String country:countries) {
			Greeter greeter = new Greeter(country);
			new Thread(greeter,country+"thread").start();
		}

	}

}
