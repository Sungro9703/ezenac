package kr.co.ezenac.loop2;

public class ContinueTest {

	public static void main(String[] args) {
		// 1~100 중 홀수만 출력
		
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				continue;		//continue문은 뒷문장은 실행하지 않고 바로 증감식으로 이동.
			}
			System.out.println("홀수: " + i);
		}
		
		//2와 3의 공배수만 출력하시오.
		
		for(int i=1; i<=100; i++) {
			if((i%2 == 0) && (i%3 == 0)) {
				System.out.println("2와3의 공배수: " + i);
			}
		}
		
		
		
	
	}

}
