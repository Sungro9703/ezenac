package kr.co.ezenac.arraylist;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// Integer 타입만 들어가도록 정의
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(3);
		
		// subList(): list의 값을 list2로 복사 - 마지막 값 포함안함
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		
		print(list, list2);
		
		
	}

	public static void print(ArrayList<Integer> list, ArrayList list2) {
		System.out.println("list: " + list.toString());
		System.out.println("list2: " + list2.toString());
		System.out.println();
	}
	
	
	
	
}
