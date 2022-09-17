package kr.co.ezenac.member3;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		
		System.out.println(t.getHour());
		System.out.println(t);
		
		t.setHour(11);
		
		t.setMinute(30);
		
		t.setSecond(50);
		
		System.out.println(t);
		
	}

}
