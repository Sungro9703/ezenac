package kr.co.ezenac.thread;


class MyThread extends Thread {
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

public class ThreadClass {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		/*
		 * 스레드 run()메서드 바로 호출하지 않고
		 * 		start() 메서드를 호출해야 run()메서드가 실행됨
		 */
		myThread.start();
		System.out.println("main 메서드의 스레드 이름: " + Thread.currentThread().getName());

	}

}
