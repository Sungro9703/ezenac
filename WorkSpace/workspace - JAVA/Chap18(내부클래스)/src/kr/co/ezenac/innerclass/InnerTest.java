package kr.co.ezenac.innerclass;

class OutClass {
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();		//내부 클래스 생성
	}
	
	class InClass {
		int inNum = 100;
//		static int sInNum;				// 에러 (static 사용불가)
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
		}
//		static void sTest() {}			// static 메서드 사용 불가
			
	}
	
	public void usingInClass() {
		inClass.inTest();				// 내부 클래스 참조변수 사용하여 메서드 호출하기
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingInClass();		// 내부 클래스 기능 호출
		System.out.println();
		
		OutClass.InClass inClass = outClass.new InClass();		// 외부 클래스를 이용하여 내부 클래스 생성
		System.out.println("외부 클래스를 이용하여 내부 클래스 생성");
		inClass.inTest();
	}
}






