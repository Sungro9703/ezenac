package kr.co.ezenac.array4;

import java.util.Arrays;

public class ArraySort3 {

	public static void main(String[] args) {
		double[] arr = {4.4, 3.3, 2.2, 1.1};
		String[] arr2 = {"이순신", "권율", "이연", "류성룡"};
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		// 오름차순 정렬 1
//		for(double d : arr)
//			System.out.print(d + "\t");
//		System.out.println();
//	
//		for(String str : arr2)
//			System.out.print(str + "\t");
		
		// 오름차순 정렬 2
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		
		
		
	
	}

}
