package stringExamples;

public class String1 {

	public static void StringEg1() {
		String string1 = new String("ABC");
		String string2 = new String("ABC");
		System.out.println(string1 == string2);
		System.out.println(string1.equals(string2));
	}

	public static void StringEg2() {
		String string = new String("Ansh");
		string.concat(" Sharma");
		System.out.println(string);
	}

	// String Objects are immutable i.e any changes happen on the other objects
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringEg2();
		StringEg1();
	}

}
