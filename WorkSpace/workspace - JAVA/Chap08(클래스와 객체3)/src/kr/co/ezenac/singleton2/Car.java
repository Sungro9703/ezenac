package kr.co.ezenac.singleton2;
/*
 *  static과 싱글톤 패턴 적용,구현
 *  	- 자동차 공장
 *  	  자동차 공장이 유일한 객체
 *  	  이 공장에서 생산되는 자동차는 제작할 때마다 고유의 번호가 부여
 *  	  자동차 번호가 10001부터 1씩 증가 10002, 10003 ..
 *  	  
 */ 	
public class Car {
	public static int serialNum = 10000;
	private int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}

	public int getCarNum() {
		return carNum;
	}
	
	
	
}
