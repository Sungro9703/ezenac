package kr.co.ezenac.constructor;

public class Student {
	
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
//	1. 클래스명과 생성자명이 반드시 같아야 함
//	2. 생성자는 리턴타입이 존재하지 않음(void라는 것을 써주지 않음)
//	3. 생성자가 하나도 없는 클래스는 기본적으로 컴파일 시 자동으로 기본 생성자가 추가 됨
	
	public Student() {
		System.out.println("기본 생성자 호출");
	}

	public Student(String name, int age) {
		System.out.println("매개변수가 있는 생성자 호출");
		this.name = name;
		this.age = age;
	}
	
	//매개변수가 String만 있는 생성자
	public Student(String name) {
		System.out.println("매개변수가 String만 있는 생성자");
		this.name = name;
	}
	
	
	//매개변수가 int만 있는 생성자
	public Student(int age) {
		System.out.println("매개변수가 int만 있는 생성자");
		this.age = age;
	}
	
	
	
	
	@Override
	public String toString() {
		
		return this.getName() + ", " + this.getAge();
	}
	
}
