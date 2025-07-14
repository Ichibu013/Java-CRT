package company_questions;

public class MissingValueArray {

	public static int missing(int[] ary) {
		int missing = 0, i = 1;
		for (int j : ary) {
			if (j == i) {
				i++;
				continue;
			}
			missing = i;
		}
		return missing;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Missing Value : " + missing(ary));
	}

}
/*
 * Short logic int[] ary = {1,2,4,5,6,7,8,9,10}; int n = ary.length + 1; int sum
 * = n(n+1)/2; // calculating sum of all ary elements for(int i : ary){ sum -=
 * i; // subtracting elements form sum i.e 55 - 52 = 3; } sop(sum); //
 * displaying the remaining sum i.e 3;
 */
