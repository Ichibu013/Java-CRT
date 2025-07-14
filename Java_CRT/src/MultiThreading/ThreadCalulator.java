package MultiThreading;

class AdditionThread extends Thread {
	private int a;
	private int b;

	public AdditionThread(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("add : " + (a + b));
	}
}

class SubtractionThread extends Thread {
	private int a;
	private int b;

	public SubtractionThread(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("sub : " + (a - b));
	}
}

class MultiplicationThread extends Thread {
	private int a;
	private int b;

	public MultiplicationThread(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("mult : " + (a * b));
	}
}

class DivisionThread implements Runnable {
	private int a;
	private int b;

	public DivisionThread(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		System.out.println("divi : " + (a / b));
	}
}

public class ThreadCalulator extends Thread {

	public static void main(String[] args) {

		// Make objects of my classes
		AdditionThread addThread = new AdditionThread(10, 10);
		SubtractionThread subThread = new SubtractionThread(10, 10);
		MultiplicationThread multiThread = new MultiplicationThread(10, 10);

		// start these threads directly
		addThread.start();
		subThread.start();
		multiThread.start();

		// Create a runnable object
		DivisionThread divThread = new DivisionThread(10, 10);

		// pass that runnable object to thread
		Thread thread = new Thread(divThread);

		// start the tread with runnable object
		thread.start();

		Thread objThread = new Thread(new Runnable() {
			public void run() {
				System.out.println("Runnable inside thread defination");
			}
		});

		objThread.start();

	}
}
