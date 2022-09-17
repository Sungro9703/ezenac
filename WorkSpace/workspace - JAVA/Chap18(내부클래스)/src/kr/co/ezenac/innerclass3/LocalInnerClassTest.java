package kr.co.ezenac.innerclass3;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {					// 지역변수 - 메서드 호출 후 끝날 때까지 유효
		int num = 100;								// 지역변수 - 메서드 호출 후 끝날 때까지 유효
		
		class MyRunnable implements Runnable {			
			
			@Override
			public void run() {		// 내부 객체를 생성한 후 언제든 다시 호출 가능
//				num = 200;			// 값을 재할당 할 수는 없음
//				i = 10;
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
		}
		return new MyRunnable();
	}
}

public class LocalInnerClassTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);		// 로컬변수는 호출 후 유효하지 않게 됨
		runnable.run();									// 언제든 호출 가능한 상태
	}

}
