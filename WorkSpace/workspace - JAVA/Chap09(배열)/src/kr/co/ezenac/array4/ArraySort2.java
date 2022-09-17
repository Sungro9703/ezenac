package kr.co.ezenac.array4;

import java.util.Arrays;

public class ArraySort2 {

	public static void main(String[] args) {
		//Array.sort()로 정렬
		int[] ball = new int[5];
		
		for(int i=0; i<ball.length; i++) {
			ball[i] = (int)(Math.random()*45) + 1;
		}
		
		System.out.println("정렬 전:");
		for(int i=0; i<ball.length; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(ball);
		
		System.out.println("정렬 후:");
		for(int i=0; i<ball.length; i++) {
			System.out.print(ball[i] + " ");
		}
		
	}

}
