package polymorphism.overriding;

public class Test extends remarry {

	public static void main(String[] args) {

		property p = new property();
		p.marry();

		remarry r = new remarry();
		r.marry();

		property p1 = new remarry();
		p1.marry();

	}

}
