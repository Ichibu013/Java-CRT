package grabage_collector;

import java.util.Date;

public class GarbageCollectorEg {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime runtime = Runtime.getRuntime(); // getRuntime() is static method
		System.out.println(runtime.totalMemory());
		System.out.println(runtime.freeMemory());
		for (int i = 0; i < 10000; i++) {
			Date dtDate = new Date();
			dtDate = null;
		}
		System.out.println(runtime.freeMemory());
		System.gc();
		System.out.println(runtime.freeMemory());
	}

}
