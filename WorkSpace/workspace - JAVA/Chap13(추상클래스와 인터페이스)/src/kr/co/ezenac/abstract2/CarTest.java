package kr.co.ezenac.abstract2;

public class CarTest {

	public static void main(String[] args) {
		Car manualcar = new ManualCar();
		manualcar.run();
		
		System.out.println();
		
		Car selfDrivingcar = new SelfDrivigCar();
		selfDrivingcar.run();

	}

}
