package kr.co.ezenac.constructor2;

public class Car {

	String color;
	String gearType;
	int door;
	
	public Car() {
		this.color = "노랑";
		this.gearType = "수동";
		this.door = 4;
	}
	
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	//인스턴스 복제를 위한 생성자
	public Car(Car car) {
		this.color = car.color;
		this.gearType = car.gearType;
		this.door = car.door;
	}
	

	@Override
	public String toString() {
		
		return this.color + ", " +
				this.gearType + ", " +
				this.door;
	}

}
