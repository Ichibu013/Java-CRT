package company_questions;

public class FibonacciSeries {
	public static void fibo(int num) {
		int sec = 1, fist = 0;
		for (int i = 0; i < num; i++) {
			System.out.println(fist);
			int nxt = fist + sec;
			fist = sec;
			sec = nxt;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibo(10);
	}

}
