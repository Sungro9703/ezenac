package kr.co.ezenac.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//최대 스레두 수가 2개인 스레드 풀
public class ThreadPool2 {
	public static void main(String[] args) {
	
		Runnable task1 = () -> {
			String name = Thread.currentThread().getName();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {}
			System.out.println(name + " 5초 후 실행");
		};
		Runnable task2 = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " 바로 실행");
		};
	
		Runnable task3 = () -> {
			String name = Thread.currentThread().getName();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			System.out.println(name + " 2초 후 실행");
		};
	
		// 스레드 풀에서 수행할 수 있는 스레드의 총량을 제한
		// 현재 스레드 풀은 동시에 스래드 두개를 처리할 수 있음
		ExecutorService pool = Executors.newFixedThreadPool(2);
	
		//스레들 스레드풀에 전달
		pool.submit(task1);
		pool.submit(task2);
		pool.submit(task3);
	
		//마지막 스레드가 종료되면 스레드 풀을 종료시킴
		pool.shutdown();
	}
}
