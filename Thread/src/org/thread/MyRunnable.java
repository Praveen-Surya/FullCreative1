package org.thread;

public class MyRunnable implements Runnable {

	public synchronized void run() {

		for (int i = 0; i < 2; i++) {

			System.out.println("Iteration Value " + i);
			Thread currentThread = Thread.currentThread();
			String threadName = currentThread.getName();
			System.out.println("Name of the Thread: " + threadName);

			try {

				System.out.println("Sleep State Starts");
				Thread.sleep(3000);
				System.out.println("Sleep State Ends");

			} catch (InterruptedException interruptedException) {

				System.out.println("Interrupted Exception Occured");

			}
		}

	}

	public static void main(String[] args) {

		// MyRunnable type object --- can't able to start Thread life cycle
		MyRunnable myRunnable = new MyRunnable();

		// MyRunnable type object convert to Thread type object ------ can able to start
		// Thread life cycle

		// Thread 1
		Thread developer = new Thread(myRunnable);
		developer.setName("Developer Java Thread");
		developer.start();

		// Thread 2
		Thread user = new Thread(myRunnable);
		user.setName("User Java Thread");
		user.start();

		// Thread 3
		Thread tester = new Thread(myRunnable);
		tester.setName("Tester Java Thread");
		tester.start();
	}

}
