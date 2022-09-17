package kr.co.ezenac.array;

import java.util.Arrays;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[10];
		
		for(int i=0; i<arr1.length; i++) {
			// 범위 1~10의 난수 대입
			arr1[i] = (int)(Math.random()*10) + 1;
		}
		
		System.out.println(Arrays.toString(arr1));
//							↑ 배열 내용 보여줌
	
		
		int[] numbers = {10, 20, 30};
		for(int i : numbers) {
			System.out.println(i);
		}
	}

}
