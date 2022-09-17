package kr.co.ezenac.constructor2;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();		// 기본형 차 주문
		System.out.println(car);

		Car car2 = new Car("흰색", "오토", 4);		//직접 차 주문
		System.out.println(car2);
	
		Car2 car3 = new Car2();
		System.out.println(car3);
	
		Car car4 = new Car(car);
		System.out.println(car4);
		
		Car2 car5 = new Car2(car3);
		System.out.println(car5);
	}
		
}
