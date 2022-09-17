package kr.co.ezenac.interface5;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		X xClass = mClass;
		xClass.x();
		
		System.out.println();
		
		Y yClass = mClass;
		yClass.y();
		
		System.out.println();
		
		MyClass myClass = mClass;
		myClass.x();
		myClass.y();
		myClass.myMethod();
		
	}

}
