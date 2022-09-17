package kr.co.ezenac.arraylist3;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(2022, "이순신");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		
		Student studentShin = new Student(2020, "신사임당");
		studentShin.addSubject("국어", 90);
		studentShin.addSubject("수학", 99);
		studentShin.addSubject("영어", 91);
				
		studentLee.showInfo();
		System.out.println();
		studentShin.showInfo();
	}

}
