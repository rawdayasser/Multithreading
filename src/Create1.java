
/*
 * There are 2 ways to use Thread:
 * 1. A class that extends Thread
 * 2. A class that implements Runnable
 * This is the First way...
 */
public class Create1 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread is running...");
	}
}
