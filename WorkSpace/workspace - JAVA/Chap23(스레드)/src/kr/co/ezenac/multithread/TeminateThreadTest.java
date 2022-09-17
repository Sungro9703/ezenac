package kr.co.ezenac.multithread;

import java.io.IOException;

public class TeminateThreadTest extends Thread {

	private boolean flag = false;
	
	public TeminateThreadTest(String name) {
		super(name);
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}


	@Override
	public void run() {
		while(!flag) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(getName()+ "thread end");
	}
	
	public static void main(String[] args) throws IOException {
		TeminateThreadTest threadA = new TeminateThreadTest("A");
		TeminateThreadTest threadB = new TeminateThreadTest("B");
		TeminateThreadTest threadC = new TeminateThreadTest("C");
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		System.out.print("종료시킬 스레드 이름을 입력하세요. (A, B, C, M)");
		
		
		while(true) {
			int in = System.in.read();
			System.in.read();
			System.in.read();
//			int in2 = System.in.read();
//			int in3 = System.in.read();
//			
//			System.out.println("in = " + in);
//			System.out.println("in2 = " + in2);
//			System.out.println("in3 = " + in3);
			
			if(in == 'A') {
				threadA.setFlag(true);
			}
			else if(in == 'B') {
				threadB.setFlag(true);
			}
			else if(in == 'C') {
				threadC.setFlag(true);
			}
			else if(in == 'M') {
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				break;
			}
			else {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요");
			}
		}
		System.out.println("Main Thread End");
	}

}
