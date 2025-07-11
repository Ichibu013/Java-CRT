package staticKeyword;

public class StudentDetails {

	int rollno;
	String nameString;
	static String clgString = "Keystone School Of Engineering";

	public StudentDetails(int rollno, String nameString) {
		super();
		this.rollno = rollno;
		this.nameString = nameString;
	}

	public void display() {
		System.out.println(rollno);
		System.out.println(nameString);
		System.out.println(clgString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails obj = new StudentDetails(10, "Ansh");
		obj.display();
		StudentDetails obj1 = new StudentDetails(11, "aditya");
		obj1.display();
	}

}
