package kr.co.ezenac.multithread;

// 1부터 50까지, 51부터 100까지 합을 구하는 두개의 Thread
public class JoinTest extends Thread {
	
	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		int i;
		for(i=start; i<=end; i++) {
			total +=i;
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread() + " start");

		JoinTest jTest1 = new JoinTest(1, 50);
		JoinTest jTest2 = new JoinTest(51, 100);
		
		jTest1.start();
		jTest2.start();
		
		try {
			jTest1.join();
			jTest2.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		int lastTotal = jTest1.total + jTest2.total;
		
		System.out.println("jTest1.total = " + jTest1.total);
		System.out.println("jTest2.total = " + jTest2.total);

		System.out.println("lastTotal = " + lastTotal);
		
		
		
		System.out.println(Thread.currentThread() + " end");

	}

}
