package abstraction;
import java.util.Scanner;

public class Ansh implements client {

	
	Scanner sc=new Scanner(System.in);
	
	public String Name;
	public Double salary;
	
	@Override
	public void input() {
		System.out.println("ENter Name");
		Name=sc.next();
		
		System.out.println("ENter salary");
		salary=sc.nextDouble();
		
	}

	@Override
	public void output() {
		System.out.println("THe name is "+Name+"And Salary Is "+salary);
		
	}

}
