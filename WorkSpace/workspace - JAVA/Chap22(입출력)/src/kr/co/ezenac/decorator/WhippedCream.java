package kr.co.ezenac.decorator;

public class WhippedCream extends Decorator {

	public WhippedCream(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void brewing() {
		super.brewing();
		System.out.println("Adding Mocha Whipped Cream");
	}
}
