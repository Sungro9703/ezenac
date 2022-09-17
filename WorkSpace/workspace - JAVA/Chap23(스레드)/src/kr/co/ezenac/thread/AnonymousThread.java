package kr.co.ezenac.thread;

public class AnonymousThread {

	public static void main(String[] args) {
		Runnable task = new Runnable() {
			
			@Override
			public void run() {

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}
				int sum = 0;
				for(int i=0; i<10; i++) 
					sum += i;
				
				// 스레드명: 일련번호가 붙여진 이름 반환
						String name = Thread.currentThread().getName();
						System.out.println(name + ":" + sum);
				
			}
		};
		
		Thread thread = new Thread(task);
		thread.start();
		System.out.println("main 메서드의 스레드 이름: " + Thread.currentThread().getName());

	}

}
