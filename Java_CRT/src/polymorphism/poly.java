package polymorphism;

public class poly {
	
	public void m1() {
		System.out.println("hello No args");
	}
	
	public void m1(int i) {
		System.out.println("int method"+i);
	}
	
	
	public void m1(String s) {
		System.out.println("String method "+s);
	}
	
	public static void main(String[] args) {
		poly p = new poly();
		
		p.m1();
		p.m1(2);
		p.m1("hii");
	}

}
