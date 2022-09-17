package kr.co.ezenac.staticvariable2;

class Dog {
	static int a = 5;		//static 변수
	int num = 3;
	
	public void printValue(int num) {
		this.num = num;
		System.out.println("num: " + this.num);
		System.out.println("a: " + a);
	}
	
}

public class GlobalVariable {
		public static void main(String[] args) {
			int num1 = 5;
			int num2 = 2;
			
			Dog dog1 = new Dog();		// dog1은 스택 영역에 생성
			dog1.num = 1;
			dog1.a = 10;				// static 변수에 접근
			Dog.a = 11;
			System.out.println(dog1.num);
			System.out.println(dog1.a);
			
			Dog dog2 = new Dog();		// dog2는 스택 영역에 생성
			dog2.num = 2;
//			dog2.a = 20;
			Dog.a = 21;					// static 변수에 접근
			System.out.println(dog2.num);
			System.out.println(Dog.a);
		}
	
	
}
