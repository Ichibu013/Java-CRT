package Java8Features;

interface abc {
	void m1();

	default void m2() {
		System.out.println("m2");
	}

	static void m3() {
		System.out.println("m3");
	}
}

public class defaultStatic implements abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc obj = new defaultStatic();
		obj.m1();
		obj.m2();
		abc.m3(); // can only call static method in interface using interface name
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1");
	}

}
