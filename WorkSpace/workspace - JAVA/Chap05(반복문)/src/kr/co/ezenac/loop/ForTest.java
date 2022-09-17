package kr.co.ezenac.loop;

public class ForTest {

	public static void main(String[] args) {

		int sum = 0;
		// 1 ~ 100까지 합을 구하라
		for(int i=1; i<=100; i++) {
			sum += i;
//			System.out.println("sum: " + sum);
		}
		System.out.println("1~100의 합: " + sum);
	}

}
