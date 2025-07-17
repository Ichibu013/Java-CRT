package collectionFramework;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEg {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet list = new TreeSet(); // ClassCasteException is added heterogeneous values as treeset does not support
										// it

		list.add(10);
		list.add(125);
		list.add(85);
		list.add(10);
		list.add(89);

		System.out.println(list.first());
		System.out.println(list.last());
		System.out.println(list.headSet(89));
		System.out.println(list.tailSet(89));
		System.out.println(list.subSet(85, 125));
	}

}
