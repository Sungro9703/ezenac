package kr.co.ezenaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

	public static void main(String[] args) {
		//빈을 생성
		ApplicationContext context = new ClassPathXmlApplicationContext("aoptest.xml");
		Calculator cal = (Calculator)context.getBean("proxyCal");
		
		//id가 proxyCal인 빈 접근
		cal.add(100, 20);
		System.out.println();
		
		cal.substract(100,20);
		System.out.println();

		cal.multiply(100, 20);
		System.out.println();

		cal.divide(100, 20);
	}
}
