package collectionFramework;

import java.util.HashMap;

public class HashMapEg {

	public static void main(String[] args) {
		HashMap hMap = new HashMap();
		hMap.put("Ansh", 1);
		hMap.put(null, 1);
		hMap.put(10, 1);
		hMap.put(2.2, 1);
		hMap.put('a', 1);
		System.out.println(hMap);
	}

}
