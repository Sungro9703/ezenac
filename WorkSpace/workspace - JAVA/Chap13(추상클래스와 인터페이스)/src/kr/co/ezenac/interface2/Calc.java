package kr.co.ezenac.interface2;

public interface Calc {
	//모든 변수는 상수로
	double PI = 3.14;
	int ERROR = -99999999;
	
	//모든 메서드는 추상 메서드
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
