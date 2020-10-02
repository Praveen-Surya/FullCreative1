package org.thread;

// Thread Life Cycle Using Lambda Expression

public class ThreadUsingLambda {

	public static void main(String[] args) {

		Runnable runnable =  () -> {

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

		};

		// Thread 1
		Thread developer = new Thread(runnable);
		developer.setName("Developer Java Thread");
		developer.start();

		// Thread 2
		Thread user = new Thread(runnable);
		user.setName("User Java Thread");
		user.start();

		// Thread 3
		Thread tester = new Thread(runnable);
		tester.setName("Tester Java Thread");
		tester.start();

	}

}
