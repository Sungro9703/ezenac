package kr.co.ezenac.polymorphism;

public class Player {
	
	private String name;
	private int age;
	private int backNumber;
	private int speed;
	
	
	public Player(String name, int age, int backNumber, int speed) {
		super();
		this.name = name;
		this.age = age;
		this.backNumber = backNumber;
		this.speed = speed;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getBackNumber() {
		return backNumber;
	}


	public void setBackNumber(int backNumber) {
		this.backNumber = backNumber;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void info() {
		System.out.println("이름: " + this.getName());
		System.out.println("나이: " + this.getAge());
		System.out.println("등 번호: " + this.getBackNumber());
		System.out.println("속도: " + this.getSpeed());
	}
	
	
}
