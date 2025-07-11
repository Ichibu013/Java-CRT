package polymorphism.Overloading_cases;

class Animal {

}

class Monkey extends Animal {

}

public class Case_5 {

	public void m1(Animal a) {
		System.out.println("ANimal version");
	}

	public void m1(Monkey b) {
		System.out.println("Monkey version");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Case_5 t = new Case_5();

		Animal a = new Animal();

		t.m1(a);

		Monkey m = new Monkey();
		t.m1(m);

		Animal x = new Monkey();/// here it takes method of animal cause the reference is of Animal class  
		t.m1(x);// parent reference can hold child object ..so jiska refernce uski method or iin
				// overrriding jiska object uska method

	}

}
