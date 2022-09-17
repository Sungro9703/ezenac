package kr.co.ezenac.decision3;

public class MethodTest2 {

	public static void main(String[] args) {
		
		//매개변수 없고, 반환없는 메서드
		sayEzen();
		
		//매개변수 있고, 반환없는 메서드
		addTwo(5,2);
		
		//매개변수 없고, 반환있는 메서드
		int age = getAge();
		System.out.println(age);
		
		//매개변수 있고, 반환있는 메서드
		int sum = addTwo2(2,7);
		System.out.println("합은 " + sum);
		
	}

	public static int addTwo2(int num1, int num2) {
		
		return num1 + num2;
	}

	public static int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void addTwo(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}

	public static void sayEzen() {
		System.out.println("Ezen");
	}

}
