package kr.co.ezenac.stream;

import java.lang.reflect.Array;
import java.util.Arrays;

public class intArrayStreamTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int sum = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();
		
		System.out.println(sum);
		System.out.println(count);
	}

}
