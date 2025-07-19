package company_questions;

import java.util.Arrays;

public class PalindromeArray {
	public static boolean isPalindrome(int[] num) {
		int j = num.length - 1;
		int[] pali = new int[num.length];
		for (int i : num) {
			pali[j] = i;
			j--;
		}
		return Arrays.equals(num, pali);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = { 1, 2, 1 };
		System.out.println(isPalindrome(ary));
	}

}
