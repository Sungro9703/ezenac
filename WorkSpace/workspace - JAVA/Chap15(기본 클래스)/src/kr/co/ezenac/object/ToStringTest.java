package kr.co.ezenac.object;

class Book {
	public String author;
	
	@Override
	public String toString() {
		return author;
	}
}

public class ToStringTest {
	public static void main(String[] args) {
		
		String name = "이순신";
		System.out.println(name);
		System.out.println(name.toString());

		Book myBook = new Book();
		myBook.author = "이도";
		System.out.println(myBook.author);
		System.out.println(myBook.toString());
	}
}
