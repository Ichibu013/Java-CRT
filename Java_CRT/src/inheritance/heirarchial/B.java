package inheritance.heirarchial;

public class B extends A {

	public void say() {
		System.out.println("THis is B");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		B b = new B();

	}

}
