package kr.co.ezenac.list;

import java.util.LinkedList;

public class LikedListTest {

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<>();
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.add(1,"D");		// 1번 째에 D 추가
		System.out.println(myList);
		
		myList.removeLast();	// 마지막 배열 삭제
		System.out.println(myList);
		
		for(int i=0; i<myList.size(); i++) {
			String s = myList.get(i);
			System.out.println(s);
		}
	}

}
