package collectionFramework;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();
		arrayList.add(10);
		arrayList.add("Example");
		arrayList.add('a');
		arrayList.add(10);
		arrayList.add(10.2);
		arrayList.add(null);
		ArrayList arrayList2 = new ArrayList();
		arrayList2.addAll(arrayList);
		System.out.println(arrayList);
		System.out.println(arrayList2);

	}

}
// .add to add elements to arraylist
// .addAll adding one list in other
// .get to get element at a particular index
// we can directly print arraylist unlike arrays
// ArrayList<String> -> <String> is generic specific i.e specify type of ArrayList thus it will only except that element
// Without	generic ArrayList made is of type object