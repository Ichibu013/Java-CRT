package polymorphism;

class parent {
	public static void m1() {
		System.out.println("Parent Method");
	}
}

class child extends parent {
	public static void m1() {
		System.out.println("Child Method");
	}
}

public class MethodHiding {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		parent parent = new parent();
		parent.m1();
		child child = new child();
		child.m1();
		parent parent2 = new child();
		parent2.m1();
	}

}
