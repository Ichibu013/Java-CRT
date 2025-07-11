package encapsulation;

public class Example1 {

	private int i;
	private String string = "Ansh";

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example1 objExample1 = new Example1();
		objExample1.setI(10);
		System.out.println(objExample1.getI());
		System.out.println(objExample1.getString());
		Example1 objExample2 = new Example1();
		objExample2.setString("Aditya");
		System.out.println(objExample2.getString());
	}

}
