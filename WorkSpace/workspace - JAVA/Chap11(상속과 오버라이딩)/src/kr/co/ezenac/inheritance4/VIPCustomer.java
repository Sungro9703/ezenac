package kr.co.ezenac.inheritance4;

public class VIPCustomer extends Customer {
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
//		super();	- 부모 클래스를 호출하는 역할(생략 가능)
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);	//- 부모 클래스를 호출하는 역할(생략 가능)
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}
	
	
	public int getAgentID() {
		return agentID;
	}
	
	
	
}
