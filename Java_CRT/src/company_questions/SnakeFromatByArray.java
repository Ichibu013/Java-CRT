package company_questions;

public class SnakeFromatByArray {

	public static void snake(int[][] ary, int m, int n) {
		for (int i = 0; i <= m - 1; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) {
					System.out.print(ary[j][i] + " ");
				}
			} else {
				for (int j = n - 1; j >= 0; j--) {
					System.out.print(ary[j][i] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int ary[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		snake(ary, 3, 3);
	}

}
