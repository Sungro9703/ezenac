package kr.co.ezenac.singleton2;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car myCar = factory.creatCar();
		Car yourCar = factory.creatCar();
		
		System.out.println(myCar.getCarNum());
		System.out.println(yourCar.getCarNum());
	}

}
