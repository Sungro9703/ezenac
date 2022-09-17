package kr.co.ezenac.collaboration;

public class Student {
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1201);
		this.money -= 1201;
	}
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void studentInfo() {
		System.out.println(studentName + "님의 남은 돈은 "+ money +"원 입니다.");
	}
	
	
}
