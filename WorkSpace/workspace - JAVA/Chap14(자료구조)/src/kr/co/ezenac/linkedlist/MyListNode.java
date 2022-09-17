package kr.co.ezenac.linkedlist;

public class MyListNode {
	
	private String data;		//자료
	public MyListNode next;		//다음 노드를 가리키는 링크, 타입은 자기자신
	
	public MyListNode() {
		data = null;
		next = null;
	}

	public MyListNode(String data) {
		this.data = data;
		this.next = null;
	}
	
	public MyListNode(String data, MyListNode link) {
		this.data = data;
		this.next = link;
	}
	
	public String getData() {
		return data;
	}
}
