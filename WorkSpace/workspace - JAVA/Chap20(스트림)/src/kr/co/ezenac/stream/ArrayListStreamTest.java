package kr.co.ezenac.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<>();
//		sList.add("Micheal Jackson");
//		sList.add("Mariah Carey");
//		sList.add("BTS");
		sList.add("이순신");
		sList.add(""
				+ "하륜");
		sList.add("류성룡");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		sList.stream().sorted().forEach(s -> System.out.print(s + " "));
	}

}
