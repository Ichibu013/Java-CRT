package EasyEg;

import java.util.ArrayList;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arrayList = new ArrayList();
		Integer integer = 10;
		arrayList.add(10);
		System.out.println(arrayList);
		System.out.println(integer);
		System.out.println(Integer.valueOf(10));
		int i = integer.intValue();
		System.out.println(i);
	}

}
