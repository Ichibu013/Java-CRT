package inheritance;

class p {
	int n = 10;
}

class C extends p {
	int n = 20;

	void display() {
		System.out.println(n);
		System.out.println(super.n);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.display();
	}
}
