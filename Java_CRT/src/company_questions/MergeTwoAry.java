package company_questions;

public class MergeTwoAry {
	static void mergeAry(int[] ary1, int[] ary2) {
		int[] mergedAry = new int[ary1.length + ary2.length];

		for (int i = 0; i < ary1.length; i++) {
			mergedAry[i] = ary1[i];
		}

		for (int i = 0; i < ary2.length; i++) {
			mergedAry[ary1.length + i] = ary2[i];
		}

		System.out.println("Merged Array Elements:");
		for (int i : mergedAry) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int[] ary1 = { 1, 2, 3, 4, 5 };
		int[] ary2 = { 6, 7, 8, 9, 10 };

		mergeAry(ary1, ary2);
	}

}
