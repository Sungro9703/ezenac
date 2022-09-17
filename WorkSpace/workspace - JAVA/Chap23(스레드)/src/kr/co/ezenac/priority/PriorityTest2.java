package kr.co.ezenac.priority;

class PriorityThread2 extends Thread {
	@Override
	public void run() {
		int sum = 0;
		Thread thread = Thread.currentThread();
		System.out.println(thread + "start");
		
		for(int i=0; i<=1000000; i++) {
			sum += i;
		}
		System.out.println(thread.getPriority() + " 우선순위 스레드 end");
	}
}

public class PriorityTest2 {

	public static void main(String[] args) {
		
		PriorityThread2 pThread1 = new PriorityThread2();
		PriorityThread2 pThread2 = new PriorityThread2();
		PriorityThread2 pThread3 = new PriorityThread2();
		
		pThread1.setPriority(Thread.MIN_PRIORITY);
		pThread2.setPriority(Thread.NORM_PRIORITY);
		pThread2.setPriority(Thread.MAX_PRIORITY);
		
		pThread1.start();
		pThread2.start();
		pThread3.start();
		
	}
}

