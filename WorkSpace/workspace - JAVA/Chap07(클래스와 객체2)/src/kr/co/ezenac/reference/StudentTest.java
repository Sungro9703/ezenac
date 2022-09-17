package kr.co.ezenac.reference;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student(2022, "이순신");
		student1.setKoreaSubject("국어", 100);
		student1.steMathSubject("수학", 90);
		
		Student student2 = new Student(2021,"신사임당");
		student2.setKoreaSubject("국어", 99);
		student2.steMathSubject("수학", 98);

		student1.showStudentScore();
		student2.showStudentScore();
	}

}
