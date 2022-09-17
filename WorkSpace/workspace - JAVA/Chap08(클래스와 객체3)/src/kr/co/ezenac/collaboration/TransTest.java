package kr.co.ezenac.collaboration;

public class TransTest {

	public static void main(String[] args) {
		Student student1 = new Student("정도전", 5000);
		Student student2 = new Student("궁예", 10000);
		
		Bus bus9802 = new Bus(9802);
		Subway subway9 = new Subway(9); 
 		
		student1.takeBus(bus9802);
		student2.takeSubway(subway9);
		
		student1.studentInfo();
		student2.studentInfo();
		
		bus9802.busInfo();
		subway9.subwayInfo();
	}

}
