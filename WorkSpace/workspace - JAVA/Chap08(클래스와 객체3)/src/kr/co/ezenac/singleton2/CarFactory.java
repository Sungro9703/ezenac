package kr.co.ezenac.singleton2;


public class CarFactory {
	private CarFactory() {}
	private static CarFactory instance = new CarFactory();
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car creatCar() {
		Car car = new Car();
		return car;
	}
	
}
