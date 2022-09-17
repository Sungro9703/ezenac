package kr.co.ezenac.lambda2;

@FunctionalInterface		// 함수형 인터페이스
public interface MyInterface {

	void method(int x);
//	void method2();		// 추상 메서드가 2개 이상이면 컴파일 예외 발생

}
