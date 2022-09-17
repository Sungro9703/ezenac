package kr.co.ezenac.polymorphism2;

/*
 *  instanceof 연산자의 결과가 true라는 것은
 *  실제 형변환이 가능하다는 것을 의미
 *  아울려 상속관계에 있는 것
 */

public class InstanceOfTest {

	public static void main(String[] args) {
		SportCar sportCar = new SportCar();
		
		// 변수 instanceof 클래스 : 타입이 맞는지 확인
		if(sportCar instanceof SportCar) {
			System.out.println("SportCar로 타입변환이 가능");
		}
		
		if(sportCar instanceof Car) {
			System.out.println("Car로 타입변환이 가능");
		}

		if(sportCar instanceof Object) {
			System.out.println("Object로 타입변환이 가능");
		}

		
	}

}
