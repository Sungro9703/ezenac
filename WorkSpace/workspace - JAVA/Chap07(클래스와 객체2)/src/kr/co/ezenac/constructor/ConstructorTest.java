package kr.co.ezenac.constructor;

// class A는 컴파일 시 자동으로 기본 생성자를 추가해줌
class A {
	int value;
}

class B {
	int value;
	
//	public B() {}
	public B(int value) {
		this.value = value;
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		A a = new A();

		B b = new B(30);
	}

}
