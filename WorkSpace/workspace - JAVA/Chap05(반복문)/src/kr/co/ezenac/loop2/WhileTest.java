package kr.co.ezenac.loop2;

public class WhileTest {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		while(i<=100) {		// while문 옆에는 조건식만 들어감
			sum += i;
			i++;
		}
		System.out.println("1~100의 합: " + sum);
		System.out.println();
		
//		while문은 무한루프용으로 많이 사용함.
//		if()문은 break문과 함께 무한루프를 벗어날 코드를 작성해야한다.
		int j =1;
		while(true) {
			System.out.println(j);
			if(j>=100) {
				break;
			}
			j++;
		}
		
	}

}
