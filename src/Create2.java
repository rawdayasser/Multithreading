/*
 * There are 2 ways to use Thread:
 * 1. A class that extends Thread
 * 2. A class that implements Runnable
 * This is the Second way...
 */
public class Create2 implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Thread is Running...");
	}
	
}
