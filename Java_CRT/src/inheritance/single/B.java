package inheritance.single;

public class B extends A {

	public void model(String type) {
		System.out.println("The type of model is" + type);
	}

	public static void main(String[] args) {

		B b = new B();
		b.color("white");
		b.model("sedan");

	}

}
