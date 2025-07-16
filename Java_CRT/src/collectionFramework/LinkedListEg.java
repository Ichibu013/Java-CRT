package collectionFramework;

import java.util.LinkedList;

public class LinkedListEg {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add(10);
		list.add("Example");
		list.add('a');
		list.add(10);
		list.add(10.2);
		list.add(null);

		System.out.println(list);
		System.out.println(list.get(5).hashCode());

		list.set(0, 25);
		list.remove(3);
//		list.
//
//		System.out.println(list);

	}

}
