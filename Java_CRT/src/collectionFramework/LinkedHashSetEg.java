package collectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetEg {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet list = new LinkedHashSet();

		list.add(10);
		list.add("Example");
		list.add('a');
		list.add(10);
		list.add(10.2);
		list.add(null);

		System.out.println(list);

	}

}
