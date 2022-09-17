package kr.co.ezenac.threadpool;

import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
	
	// 모든 스레드에서 값을 공유하여 사용
	public static int money = 0;
	
	

	public static void main(String[] args) {
		
		Runnable task1 = () -> {		// 스레드에서 시킬 작업 (10000번 동안 더하기)
			for(int i=0; i<10000; i++)
				money++;
			String name = Thread.currentThread().getName();
			System.out.println(name + ": " + money);
		};
		
		Runnable task2 = () -> {		// 스레드에서 시킬 작업 (10000번 동안 뺴기)
			for (int i=0; i<10000; i++)
				money--;
			String name = Thread.currentThread().getName();
			System.out.println(name + ": " + money);
		};
		
		// 스레드 풀 생성 - 하나의 스레드만 전달받아 처리할 수 있음
		ExecutorService pool = Executors.newSingleThreadExecutor();
		pool.submit(task1);		// 스레드 풀에 작업을 전달 => 스레드 풀은 전달된 스레드를 실행시킴
		pool.submit(task2);		// 스레드 풀에 작업을 전달
		
		System.out.println("End: " + Thread.currentThread().getName());
		
		// 마지막 스레드가 종료되면 스레드 풀을 종료시킴
		pool.shutdown();
	}

}
