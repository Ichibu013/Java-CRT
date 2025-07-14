package company_questions;

public class MuliMissValueInAry {

	public static void missing(int[] ary) {
		System.out.println("Missing Values:");
		for (int i = 1; i < ary.length; i++) {
			int current = ary[i];
			int previous = ary[i - 1];

			// Check for missing numbers between consecutive elements
			for (int j = previous + 1; j < current; j++) {
				System.out.println(j);
			}
		}
	}

	public static void main(String[] args) {
		int[] ary = { 1, 2, 4, 5, 7, 9, 10 };
		missing(ary);
	}
}
