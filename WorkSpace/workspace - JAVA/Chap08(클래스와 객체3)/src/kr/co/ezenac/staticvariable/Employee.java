package kr.co.ezenac.staticvariable;

public class Employee {
	
	public static int serialNum = 1000;
	private int employeeId;
	private String employeeName;
	private String department;

	public Employee() {
		serialNum++;
		this.employeeId = serialNum;
	}
	

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		int temp = 0;	
		Employee.serialNum = serialNum;
	}


	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}

	