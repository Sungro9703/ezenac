package kr.co.ezenac.arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		//기본적으로 초기용량(capacity) 10개 생성
		ArrayList list = new ArrayList();
		System.out.println("총 크기: " + list.size());			// .size()
		
		list.add("111");										// 순차적으로 저장
		list.add("222");
		list.add("333");
		list.add("444");
		
		System.out.println("총 크기: " + list.size());			
		
		list.add(333);			// → list.add(new Integer(333));
		System.out.println("총 크기: " + list.size());

		System.out.println("ArrayList에 있는 값: " + list.toString());		// .toString()
		
		//0번째 인덱스에 "333" 추가
		list.add(0, "333");
		System.out.println("ArrayList에 있는 값: " + list.toString()); 	// 밀려남
		
		//객체 삭제하기: 문자열 "333" 삭제 - 앞에서부터 체크
		list.remove("333");
		System.out.println("ArrayList에 있는 값: " + list.toString());
		
		// .clear() 객체 전부 삭제하기
		list.clear();
		System.out.println("ArrayList에 있는 값: " + list.toString());
	}

}
