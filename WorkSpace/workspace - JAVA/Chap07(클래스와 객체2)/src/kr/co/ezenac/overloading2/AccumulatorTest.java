package kr.co.ezenac.overloading2;
/*
 * 인스턴스(객체): new 키워드를 사용하여 클래스를 메모리에 생성한 상태
 * 참조 변수: accu 메모리에 생성된 인스턴스를 가리키는 변수
 * 참조 값: 생성된 인스턴스의 메모리 주소 값
 * 
 */
public class AccumulatorTest {
	
	public static void main(String[] args) {
		Accumulator accu = new Accumulator();
//		System.out.println(accu);
		
		int iResult = accu.add(10, 5);
		System.out.println("iResult: " + iResult);
		
		long lResult = accu.add(100, 7500L);
		System.out.println("lResult: " + lResult);
		
		lResult = accu.add(1000L, 10);
		System.out.println("lResult: " + lResult);
		
		double dResult = accu.add(107.88, 11.55);
		System.out.println("dResult: " + dResult);
		
		// 참조형 변수
		iResult = accu.add(new A());
		System.out.println("iResult: " + iResult);
		
	}
	
}
