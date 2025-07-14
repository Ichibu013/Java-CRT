package company_questions;

public class RemoveDuplicateInAry {

	static void dupliInAry(int[] ary) {
		boolean[] present = new boolean[8];
		int[] newAry = new int[ary.length];
		int j = 0;
		for (int i : ary) {
			if (present[i] == false) {
				newAry[j] = i;
				j++;
				present[i] = true;
			}
		}
		for (int i : newAry) {
			if (i != 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = { 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 7 };
		dupliInAry(ary);
	}

}
