package company_questions.employeeDetails;

public class Department {

	private Integer departmentId;

	private String name;

	private Integer employeeId;

	public Department(Integer departmentId, String name, Integer employeeId) {
		super();
		this.departmentId = departmentId;
		this.name = name;
		this.employeeId = employeeId;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

}
