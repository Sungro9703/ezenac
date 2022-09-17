package kr.co.ezenac.array4;

public class ObjectArrayCopy2 {

	public static void main(String[] args) {
//		깊은 복사 - 각각의 객체를 생성하여 그 객체의 값을 복사하여 배열이 서로 다른 객체를 가리키도록 함
		Book[] book = new Book[5];
		Book[] copyBook = new Book[5];
		
		book[0] = new Book("Go 프로그래밍 쿡북", "애런 토레스");
		book[1] = new Book("Go 프로그래밍 쿡북1", "애런 토레스1");
		book[2] = new Book("Go 프로그래밍 쿡북2", "애런 토레스2");
		book[3] = new Book("Go 프로그래밍 쿡북3", "애런 토레스3");
		book[4] = new Book("Go 프로그래밍 쿡북4", "애런 토레스4");
		
		copyBook[0] = new Book();
		copyBook[1] = new Book();
		copyBook[2] = new Book();
		copyBook[3] = new Book();
		copyBook[4] = new Book();
		
		for(int i=0; i<book.length; i++) {
			copyBook[i].setTitle(book[i].getTitle());
			copyBook[i].setAuthor(book[i].getAuthor());
		}
		
		
		book[0].setTitle("데이터 플랫폼 설계와 구축");
		book[0].setAuthor("다닐 즈부리브스키");
		
		System.out.println("==========book=========");
		for(Book book1 : book) {
			book1.showInfo();
		}
		
		System.out.println("========copybook=======");
		for(Book copyBook1 : copyBook) {
			copyBook1.showInfo();
		}
	}

}
