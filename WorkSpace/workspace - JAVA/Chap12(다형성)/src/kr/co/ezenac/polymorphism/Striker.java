package kr.co.ezenac.polymorphism;

public class Striker extends Player{
	
	private int shoot;

	public Striker(String name, int age, int backNumber, int speed, int shoot) {
		super(name, age, backNumber, speed);
		this.shoot = shoot;
	}
	
	public int getShoot() {
		return this.shoot;
	}
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println("유효 슈팅: " + this.getShoot());
	}
	
}
