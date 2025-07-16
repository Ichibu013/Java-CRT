package collectionFramework;

import java.util.HashSet;

public class HashSetEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet list = new HashSet();

		list.add(10);
		list.add("Example");
		list.add('a');
		list.add(10);
		list.add(10.2);
		list.add(null);

		System.out.println(list);
	}

}
