package kr.co.ezenac.member;

public class StudentTest {

	public static void main(String[] args) {
		
		//각각 독립된 저장공간을 가지는 인스턴스(객체)가 힙에 할당됨.
		//gc(garbage collector)가 쓰레기 객체를 수집하여 소멸시킴.
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		stu1.age = 20;
		stu1.name = "이순신";
		
		//stu1의 주소를 stu2에 대입
		stu2 = stu1;
		
		System.out.println(stu1);
		System.out.println(stu2);
	}

}
