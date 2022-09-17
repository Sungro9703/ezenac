package kr.co.ezenac.stream2;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class TerminalOperTest {

	public static void main(String[] args) {
		
		//합계
		int sum = IntStream.of(1, 3, 5, 7, 9)
				 		   .sum();
		System.out.println("sum: " + sum);
		
		//개수
		long count = IntStream.of(1, 3, 5, 7, 9)
				 			  .count();
		System.out.println("count: " + count);
		
		//평균 -	최종 연산 결과를 변수로 받지 않고, 결과가 존재한다면 출력.
		IntStream.of(1, 3, 5, 7, 9)
				 .average()
				 .ifPresent(avg -> System.out.println("avg: " + avg));	//ifPresent 존재한다면
		
		//최소
		IntStream.of(1, 3, 5, 7, 9)
				 .min()
				 .ifPresent(min -> System.out.println("min: " + min));
		
		//최대
		IntStream.of(1, 3, 5, 7, 9)
				 .max()
				 .ifPresent(max -> System.out.println("max: " + max));
		
	}

}
