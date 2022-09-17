package kr.co.ezenac.variable;
/*
 *  자료형 없이 사용하기 (자바10부터 지원됨)
 *		- Local variable type
 *		- 추론 가능한 변수에 대한 자료형은 선언하지 않음
 *		- 한번 선언하여 추론된 변수는 다른 타입의 값을 대입할 수 없음
 *		- 지역변수만 사용가능
 */
public class VarTest05 {

	public static void main(String[] args) {
		var i = 10;
		var j = 10.0;
		var str = "hello";		
				
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);

	}

}
