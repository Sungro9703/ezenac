package kr.co.ezenac.polymorphism3;

public class Parent {
	int x = 100;
	
	public void method() {
		System.out.println("조상메서드 호출");
	}
	
	//매개변수의 타입이 Object라는 것은 (매개변수의 다형성이 적용됨)
	// → 모든 클래스를 받아주겠다는 의미
	public void type(Object obj) {
		if(obj instanceof Parent) {
			Parent parent = (Parent)obj;			//강제 타입 캐스팅 (다운캐스팅)
			System.out.println("조상클래스의 멤버 x값: " + parent.x);
		}
		else {
			System.out.println("Parent타입의 객체가 아님. 상속관계에 있지 않은 클래스");
		}
	}
	
}
