package kr.co.ezenac.thread;

class MyThread2 implements Runnable {

	@Override
	public void run() {
		int sum = 0;
		for(int i=0; i<10; i++) 
			sum += i;
		
		// 스레드명: 일련번호가 붙여진 이름 반환
				String name = Thread.currentThread().getName();
				System.out.println(name + ":" + sum);
		
	}

	
}

public class RunnableInterface {
	
	public static void main(String[] args) {
		Thread myThread = new Thread(new MyThread2());
		myThread.start();
		System.out.println("main 메서드의 스레드 이름: " + Thread.currentThread().getName());

	}
}
