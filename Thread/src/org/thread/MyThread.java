package org.thread;

public class MyThread extends Thread {

	public void run() {

		for (int i = 0; i < 2; i++) {

			System.out.println("Iteration Value " + i);
			Thread thread = Thread.currentThread();
			String threadName = thread.getName();
			System.out.println("Name of the Thread " + threadName);

			try {

				System.out.println("Sleep State Starts");
				Thread.sleep(3000);
				System.out.println("Sleep State Ends");

			} catch (InterruptedException e) {

				System.out.println("Interrupted Exception Occured");

			}
		}
	}

	public static void main(String[] args) {

		// Thread type object--- starts Thread life cycle
		MyThread myThread = new MyThread();
		myThread.setName("1st Java Thread");
		myThread.start();
	}

}
