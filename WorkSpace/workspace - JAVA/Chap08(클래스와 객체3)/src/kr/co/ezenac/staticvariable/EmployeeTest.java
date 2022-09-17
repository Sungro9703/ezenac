package kr.co.ezenac.staticvariable;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.setEmployeeName("이순신");
		
		Employee employee2 = new Employee();
		employee2.setEmployeeName("왕건");
		
		System.out.println(employee1.getEmployeeName()+ ", " + employee1.getEmployeeId());
		System.out.println(employee2.getEmployeeName()+ ", " + employee2.getEmployeeId());
	
		Employee.setSerialNum(2000);
		System.out.println(Employee.serialNum);
	}

}
