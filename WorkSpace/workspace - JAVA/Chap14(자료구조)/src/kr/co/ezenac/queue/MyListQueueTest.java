package kr.co.ezenac.queue;

/*
 *  
 *  A
 *  B
 *  C
 *  A,B,C
 */

public class MyListQueueTest {

	public static void main(String[] args) {
		MyListQueue listQueue = new MyListQueue();
		listQueue.enQueue("가");
		listQueue.enQueue("나");
		listQueue.enQueue("다");
		
		listQueue.printAll();
	}

}
