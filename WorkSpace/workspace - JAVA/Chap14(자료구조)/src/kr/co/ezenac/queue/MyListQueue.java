package kr.co.ezenac.queue;

import kr.co.ezenac.linkedlist.MyLinkedList;
import kr.co.ezenac.linkedlist.MyListNode;

interface IQueue {
	void enQueue(String data);
	void deQueue();
	void printAll();
}

public class MyListQueue extends MyLinkedList implements IQueue {
	MyListNode front;
	MyListNode rear;
	
	public MyListQueue() {
		front = null;
		rear = null;
	}
	
	
	@Override
	public void enQueue(String data) {
		MyListNode newNode;
		if(isEmpty()) {						//첫번째 항목을 넣을 때
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else {								//맨 뒤에 넣는 경우
			newNode = addElement(data);
			rear = newNode;
		}
		System.out.println(newNode.getData() + "추가됨");
	}

	@Override
	public void deQueue() {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void printAll() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!");
			return;
		}
		
		MyListNode temp = front;
		while(temp != null) {
			System.out.print(temp.getData() + ", ");
			temp = temp.next;
		}
		System.out.println();
	}
	
}
