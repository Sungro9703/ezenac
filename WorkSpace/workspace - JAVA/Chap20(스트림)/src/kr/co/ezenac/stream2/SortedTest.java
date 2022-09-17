package kr.co.ezenac.stream2;

import java.util.Arrays;
import java.util.List;

public class SortedTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("이순신11111", "이도", "정도전2222", "하륜");

		//정렬
		list.stream()
			.sorted()
			.forEach(n -> System.out.print(n + "\t"));

		System.out.println();
		
		// 글자 길이순 정렬
		list.stream()
			.sorted((s1, s2) -> s1.length() - s2.length())
			.forEach(n -> System.out.print(n + "\t"));
	
	
	}

}
