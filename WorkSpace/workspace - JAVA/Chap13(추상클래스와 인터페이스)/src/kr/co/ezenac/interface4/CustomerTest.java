package kr.co.ezenac.interface4;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		
		System.out.println();
		
		Buy buy = customer;
		buy.buy();
		buy.order();
		
		System.out.println();
		
		Sell sell = customer;
		sell.sell();
		sell.order();
		
	}

}
