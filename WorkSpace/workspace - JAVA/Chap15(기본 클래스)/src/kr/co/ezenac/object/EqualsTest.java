package kr.co.ezenac.object;

class Book2{
	String author;
	@Override
	public boolean equals(Object obj) {
		// author 변수의 값을 비교하도록 오버라이딩
		if(this.author.equals(((Book2)obj).author)) {
			return true;
		}
		else
			return false;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Book2 mybook1 = new Book2();
		mybook1.author = "이순신";
		
		Book2  mybook2 = new Book2();
		mybook2.author = "이순신";
		
		if(mybook1.equals(mybook2))
			System.out.println("두 객체의 참조 id 같습니다");
		else
			System.out.println("두 객체의 참조 id 다릅니다");
	}
}
