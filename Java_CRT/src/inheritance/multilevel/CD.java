package inheritance.multilevel;

public class CD extends BC{
	
	public void fuel_type() {
		System.out.println("Petrol");
	}

	public static void main(String[] args) {
		
		CD a=new CD();
		
		a.color();
		a.model();
		a.fuel_type();

	}

}
