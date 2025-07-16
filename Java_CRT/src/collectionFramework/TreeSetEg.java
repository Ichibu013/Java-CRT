package collectionFramework;

import java.util.Comparator;
import java.util.TreeSet;

class myCom implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2); // use '-' after return to reverse the output
									// '-' is used for negation of Integer wrapper class
	}

}

public class TreeSetEg {

	public static void main(String[] args) {
//		TreeSet list = new TreeSet();
		TreeSet list = new TreeSet(new myCom());
//		TreeSet list = new TreeSet(Comparator.reverseOrder());
		list.add("ansh");
		list.add("java");
		list.add("ram");
		list.add("sham");
//		list.add(null); // does not take null

		System.out.println(list);

	}

}
