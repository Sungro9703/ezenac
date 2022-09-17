package kr.co.ezenac.constructor2;

public class Car2 {

	String color;
	String gearType;
	int door;
	
	public Car2() {
		//같은 클래스 내에 있는 매개변수가 3개인 생성자를 호출
		this("검정", "수동", 5);
	}
	
	public Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	//인스턴스 복제를 위한 생성자
		public Car2(Car2 car) {
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
