package kr.co.ezenac.stream2;

import java.util.Arrays;
import java.util.List;

public class MapTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "orange");
		
		list.stream()
			.map(s -> s.toUpperCase())			// 대문자로 변환
			.forEach(n -> System.out.print(n + "\t"));

	}

}
