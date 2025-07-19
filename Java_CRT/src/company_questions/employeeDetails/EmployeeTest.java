package company_questions.employeeDetails;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Class that is used to perform different operations on employee details
 */
public class EmployeeTest {

	static ArrayList<Employee> employees = new ArrayList<Employee>();

	/**
	 * Adding Employee details to the ArrayList
	 */
	public static void addingEmployees() {
		employees.add(new Employee(100, "Ansh", 1000000.234, new Department(101, "Development", 123)));
		employees.add(new Employee(101, "Aditya", 1100000.234, new Department(101, "Development", 123)));
		employees.add(new Employee(102, "Divesh", 1200000.234, new Department(101, "Development", 123)));
		employees.add(new Employee(103, "Fran", 1300000.234, new Department(101, "Development", 123)));
		employees.add(new Employee(103, "Ram", 1400000.234, new Department(101, "Development", 123)));
	}

	static {
		addingEmployees();
	}

	/**
	 * Displaying Employee detail
	 * 
	 * @param emp Employee Object
	 */
	public static void display(Employee emp) {
		System.out.println("----Employee Details----");
		System.out.println("Employee Id: " + emp.getEmployeeId());
		System.out.println("Employee Name: " + emp.getName());
		System.out.println("Employee Salary: " + emp.getSalary());
		System.out.println("Employee DeptID: " + emp.getDepartment().getDepartmentId());
		System.out.println("Employee DeptName: " + emp.getDepartment().getName());
		System.out.println();
	}

	public static void findEmloyeeByName() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee to the searched : ");
		String findName = scanner.nextLine();
		scanner.close();

		Optional<List<Employee>> employeeNames = employees.stream()
				.filter(employee -> employee.getName().equalsIgnoreCase(findName)).collect(Collectors.collectingAndThen(
						Collectors.toList(), list -> list.isEmpty() ? Optional.empty() : Optional.of(list)));

		if (employeeNames.isPresent()) {
			System.out.println("Found Employee(s):");
			for (Employee emp : employeeNames.get()) {
				display(emp);
			}
		} else {
			System.out.println("No such employee found with the name: " + findName);
		}

	}

	public static void sortEmployeeByName() {
		Comparator<Employee> employeeNameComparator = (e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName());
		List<Employee> sortedNames = employees.stream().sorted(employeeNameComparator).collect(Collectors.toList());
		for (Employee employee : sortedNames) {
			display(employee);
		}
	}

	public static void sortEmployeeNameByReverse() {
		List<Employee> sortedNames = employees.stream()
				.sorted((e1, e2) -> -e1.getName().compareToIgnoreCase(e2.getName())).collect(Collectors.toList());
		for (Employee employee : sortedNames) {
			display(employee);
		}
	}

	public static void sortEmployeBySal() {
		Optional<Employee> thirdHighEmployye = employees.stream()
				.sorted((e1, e2) -> -e1.getSalary().compareTo(e2.getSalary())).skip(2).findFirst();
		display(thirdHighEmployye.get());
	}

	public static void main(String[] args) {
//		findingEmloyee();
//		sortEmployee();
//		sortEmployeBySal();
		sortEmployeeNameByReverse();
	}

}
