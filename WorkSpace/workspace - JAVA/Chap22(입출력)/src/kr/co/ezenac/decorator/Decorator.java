package kr.co.ezenac.decorator;

public abstract class Decorator extends Coffee{
	
	Coffee coffee;

	public Decorator(Coffee coffee) {
//		super();
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		coffee.brewing();
		
	}
	
}
