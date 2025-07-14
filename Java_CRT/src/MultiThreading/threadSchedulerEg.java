package MultiThreading;

class threadName extends Thread {

	@Override
	public synchronized void run() {
		String string = Thread.currentThread().getName();
		for (int i = 0; i <= 2; i++) {
			System.out.println(string);
		}
	}

}

public class threadSchedulerEg {

	public static void main(String[] args) {

		threadName threadNameObj1 = new threadName();
		threadName threadNameObj2 = new threadName();
		threadName threadNameObj3 = new threadName();

		threadNameObj1.setName("Thread 1");
		threadNameObj2.setName("Thread 2");
		threadNameObj3.setName("Thread 3");

		threadNameObj1.start();
		threadNameObj2.start();
		threadNameObj3.start();
	}

}
