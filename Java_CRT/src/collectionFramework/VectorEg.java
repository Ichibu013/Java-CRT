package collectionFramework;

import java.util.Vector;

public class VectorEg {
	public static void main(String[] args) {

		Vector list = new Vector();

		list.add(10);
		list.add("Example");
		list.add('a');
		list.add(10);
		list.add(10.2);
		list.add(null);

		System.out.println(list);
	}

}
