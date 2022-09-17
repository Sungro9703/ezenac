package kr.co.ezenac.polymorphism3;

public class ParentTest {

	public static void main(String[] args) {
		Parent parent = new Child();
		Child child = new Child();
		
		//멤버변수는 선언 시 원래 타입을 유지
		System.out.println(parent.x);
		System.out.println(child.x);
		
		//멤버메서드는 오버라이드된 것을 호출
		parent.method();
		child.method();
		
		parent.type(new Child());
		parent.type(new Parent());
		parent.type(new Car());
		
	}

}
