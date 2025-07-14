package inheritance;

class p {
	int n = 10;
}

class c extends p {
	int n = 20;

	void display() {
		System.out.println(n);
		System.out.println(super.n);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c c = new C();
		C.display();
	}

}
