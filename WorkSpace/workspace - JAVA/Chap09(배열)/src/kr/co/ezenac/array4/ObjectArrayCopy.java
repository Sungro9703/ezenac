package kr.co.ezenac.array4;

public class ObjectArrayCopy {

	public static void main(String[] args) {
//		얕은 복사 - 두 배열이 같은 객체를 가리킴, 배열의 요소를 수정하면 같이 수정됨
		Book[] book = new Book[5];
		Book[] copybook = new Book[5];
		
		book[0] = new Book("Go 프로그래밍 쿡북", "애런 토레스");
		book[1] = new Book("Go 프로그래밍 쿡북1", "애런 토레스1");
		book[2] = new Book("Go 프로그래밍 쿡북2", "애런 토레스2");
		book[3] = new Book("Go 프로그래밍 쿡북3", "애런 토레스3");
		book[4] = new Book("Go 프로그래밍 쿡북4", "애런 토레스4");
		
		System.arraycopy(book, 0, copybook, 0, 5);
		
		
		book[0].setTitle("데이터 플랫폼 설계와 구축");
		book[0].setAuthor("다닐 즈부리브스키");
		
		System.out.println("========book=======");
		for(Book book1 : book) {
			book1.showInfo();
		}
		
		System.out.println("========copybook=======");
		for(Book copybook1 : copybook) {
			copybook1.showInfo();
		}
	}

}
