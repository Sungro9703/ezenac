package kr.co.ezenac.member;

public class Student {
	
	//멤버변수(필드)
	String name;
	int age;
	
	
	//Object 클래스의 toString() 오버라이딩(재정의)
//	toString(): 클래스의 멤버변수(필드)의 값들을 수시로 확인하고자 할 때나,
//				원하는 포맷으로 멤버변수들을 출력하고자 할 때 많이 사용.
	
//	this: 클래스의 주소 (new라는 연산자가 인스턴스를 생성하면 비로소 활성화됨)
	@Override
	public String toString() {
		String str = "이름: " + this.name + 
					", 나이: " + this.age;
		
		return str;
	}
	
}
