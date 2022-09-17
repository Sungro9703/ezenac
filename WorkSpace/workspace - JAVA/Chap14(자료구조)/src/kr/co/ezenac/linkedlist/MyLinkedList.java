package kr.co.ezenac.linkedlist;

public class MyLinkedList {
	private MyListNode head;
	int count;
	
	public MyLinkedList() {
		head = null;
		count = 0;	
	}
	
	public MyListNode addElement(String data) {
		MyListNode newNode;
		
		if(head == null) {						//첫번째일 때
			newNode = new MyListNode(data);
			head = newNode;
		}
		else {
			newNode = new MyListNode(data);
			MyListNode temp = head;
			while(temp.next != null)			//맨 뒤로 가서
				temp = temp.next;
			temp.next = newNode;	
		}
		count++;
		
		return newNode;
	}
	
	public MyListNode insertElement(int position, String data) {
		int i;
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);			//추가할 노드
		
		if(position < 0 || position > count) {
			System.out.println("추가할 위치 오류. 현재 리스트의 개수는" + count + "개 입니다.");
			return null;
		}
		
		if(position == 0) {
			newNode.next = head;
			head = newNode;
		}
		else {						//중간에 추가되는 경우
			MyListNode preNode = null;			//앞의 노드를 찾기 위해 선언
			for(i=0; i<position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		count++;
		return newNode;
	}
	
	
	//preNode 찾아서 삭제 처리
	public MyListNode removeElement(int position) {
		int i;
		MyListNode tempNode = head;
		if(position >= count) {
			System.out.println("삭제할 위치 오류. 현재 리스트의 개수는" + count + "개 입니다.");
			return null;
		}
		if(position == 0) {						//맨 앞에 있는 노드 삭제
			head = tempNode.next;
		}
		else {
			MyListNode preNode = null;
			for(i=0; i<position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		}
		count--;
		System.out.println(position + "번 째 항목이 삭제되었습니다.");
		return tempNode;
	}
	
	public void printAll() {
		if(count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		MyListNode temp = head;
		while(temp != null) {
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp != null) {
				System.out.print(" -> ");
			}
		}
		System.out.println("");
	}
	public void removeAll() {
		head = null;
		count = 0;
	}
	
	public int getSize() {
		return count;
	}
	
	public String getElement(int position) {
		int i;
		MyListNode tempNode = head;
		
		if(position >= count) {
			System.out.println("검색할 위치 오류. 현재 리스트의 개수는" + count + "개 입니다.");
			return new String("error");
		}
		
		if(position == 0) {			//맨 앞의 경우
			return head.getData();
		}
		
		for(i=0; i<position; i++) {
			tempNode = tempNode.next;
		}
		return tempNode.getData();
	}
	
	public boolean isEmpty() {
		if(head ==null)
			return true;
		else
			return false;
	}
	
}
