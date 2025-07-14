package MultiThreading;

class printThread extends Thread {

	@Override
	public void run() {

		super.run();
		for (int i = 0; i < 5; i++) {
			System.out.println("Print Thread : Ansh");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class ThreadEg {

	public static void main(String[] args) throws InterruptedException {

		Thread objThread = new printThread();
		objThread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread : Ansh");
			Thread.sleep(1000);
		}
	}

}
