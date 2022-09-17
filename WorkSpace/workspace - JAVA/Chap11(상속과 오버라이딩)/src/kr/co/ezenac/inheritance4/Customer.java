package kr.co.ezenac.inheritance4;

/*
 *  일반 고객(Customer)과 우수고객(VIPCustomer)에 따른 서비스 제공
 *  	- 고객 ID, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립비율(1%)
 *  
 *  물품을 구매할 때 적용되는 할인율과 적립되는 보너스 포인트 비율이 다름
 *  멤버십에 대한 구현을 상속을 활용해보시오.
 *  
 */

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer(int, String) 생성자 호출");
	}
	
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
		
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	public String showCustomerInfo() {
		return getCustomerName() + "님의 등급은 " + getCustomerGrade() +
				"이며, 보너스 포인트는 " + bonusPoint + "입니다.";
		
	}
	
}






