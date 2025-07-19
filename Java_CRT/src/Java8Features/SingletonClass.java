package Java8Features;

// Best Way
/**
 * Single Ton Class that is make only once
 */
class singleClass {
	private final static singleClass instance = new singleClass();

	private singleClass() {
	}

	public static singleClass get() {
		return instance;
	}
}

public class SingletonClass {

	public static void main(String[] args) {
		System.out.println(singleClass.get().hashCode());
		singleClass obj1 = singleClass.get();
		singleClass obj2 = singleClass.get();
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}

/*
 * -> Using static keyword class singleClass { private static singleClass
 * instance;
 * 
 * private singleClass() { }
 * 
 * public static singleClass get() { if (instance == null) { instance = new
 * singleClass(); } return instance; } }
 * 
 * public class SingletonClass {
 * 
 * public static void main(String[] args) {
 * System.out.println(singleClass.get().hashCode()); singleClass obj1 =
 * singleClass.get(); singleClass obj2 = singleClass.get();
 * System.out.println(obj1.hashCode()); System.out.println(obj2.hashCode()); }
 * 
 * }
 *
 *
 *
 * -> By Lazy Initialization
 * 
 * class singleClass { private static singleClass instance = new singleClass();
 * 
 * private singleClass() { }
 * 
 * public static singleClass get() { return instance; } }
 * 
 * public class SingletonClass {
 * 
 * public static void main(String[] args) {
 * System.out.println(singleClass.get().hashCode()); singleClass obj1 =
 * singleClass.get(); singleClass obj2 = singleClass.get();
 * System.out.println(obj1.hashCode()); System.out.println(obj2.hashCode()); }
 * 
 * }
 */