package kr.co.ezenac.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		//TreeSet<> 정렬된 결과
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("정도전");
		treeSet.add("최영");
		treeSet.add("이순신");
		
		for(String str : treeSet) {
			System.out.println(str);
		}

	}

}
