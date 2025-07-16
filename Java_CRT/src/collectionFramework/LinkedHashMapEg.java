package collectionFramework;

import java.util.LinkedHashMap;

public class LinkedHashMapEg {

	public static void main(String[] args) {
		LinkedHashMap hMap = new LinkedHashMap();
		hMap.put("Ansh", 1);
		hMap.put(null, 1);
		hMap.put(10, 1);
		hMap.put(2.2, 1);
		hMap.put('a', 1);
		System.out.println(hMap);
	}

}
