package kr.co.ezenac.stream2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		// 스트림 생성
		IntStream stm = Arrays.stream(arr);
		
		// 중간 연산 (홀수만 고름)
		IntStream stm2 = stm.filter(n -> n%2 == 1);
		
		// 최종 연산
		int sum = stm2.sum();
		
		System.out.println(sum);
		
		System.out.println();
		
		// 하나로
		sum = Arrays.stream(arr)
						  .filter(n -> n%2 ==1)
						  .sum();
		System.out.println(sum);
	}

}
