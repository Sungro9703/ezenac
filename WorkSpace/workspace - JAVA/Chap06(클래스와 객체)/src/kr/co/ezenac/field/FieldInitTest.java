package kr.co.ezenac.field;

public class FieldInitTest {

	public static void main(String[] args) {
//		fi라는 변수를 만드는 데 변수의 자료형을 FieldInit이라는 클래스형으로 함.
//		FieldInit 클래스의 FieldInit() 생성자를 이용하여 새로 만들어서(new)
//		생성된 객체를 메모리에 적재하고 변수 fi에 대입시킴
		
		FieldInit fi = new FieldInit();
		System.out.println(fi);
		System.out.println(fi.toString());
		
		System.out.println(fi.byteField);
		System.out.println(fi.booleanField);
		System.out.println(fi.floatField);
		System.out.println(fi.arrField);
		
	}
}
