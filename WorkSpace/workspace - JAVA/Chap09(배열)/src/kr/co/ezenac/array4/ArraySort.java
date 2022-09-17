package kr.co.ezenac.array4;

public class ArraySort {

	public static void main(String[] args) {
		int[] ball = new int[5];
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = (int)(Math.random()*45) + 1;
		}
		System.out.println("정렬 전:");
		for(int i=0; i<ball.length; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println();
		
		//버블 정렬
		//1차원 배열에서도 더블 루프가 필요하고 조건문이 하나 필요
		//비교해서 큰 숫자를 뒤에 배치
		//임의의 변수를 선언하여 값을 비교할 수 있다.
		
		for(int i=0; i<ball.length; i++) {
			for(int j=0; j<ball.length-1; j++) {
				if(ball[j] > ball[j+1]) {
					int temp = ball[j];
					ball[j] = ball[j+1];
					ball[j+1] = temp;
				}
			}
		}
		System.out.println("정렬 후");
		for(int i=0; i<ball.length; i++) {
			System.out.print(ball[i] + " ");
		}
	}

}
