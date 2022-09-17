package kr.co.ezenac.statictest;

public class MemberReferTest {
	
	int iv;
	static int cv;
	
	//인스턴스 메서드가 호출될 때 이미 인스턴스가 생성되어 있음
	public void instanceMethod() {
		
	}
	
	//인스턴스가 언제 생성될지 모르기 때문에
	//정적 메서드 내에서는 인스턴스 멤버들을 사용할 수 없음.
	public static void staticMethod() {
		
	}
	
}
