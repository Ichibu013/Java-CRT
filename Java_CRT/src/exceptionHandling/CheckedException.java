package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException {

	public static void printW() throws FileNotFoundException {
		PrintWriter pWriter = new PrintWriter("test.txt");
		pWriter.println("Hello");
		pWriter.close();
	}

	static void threadSleep() throws InterruptedException {
		System.out.println("Sleeping Thread");
		Thread.sleep(1000);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckedException uException = new CheckedException();

	}

}
