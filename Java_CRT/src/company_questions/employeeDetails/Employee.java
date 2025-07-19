package company_questions.employeeDetails;

public class Employee {

	private Integer employeeId;

	private String name;

	private Double salary;

	private Department department;

	public Employee(Integer employeeId, String name, Double salary, Department department) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
