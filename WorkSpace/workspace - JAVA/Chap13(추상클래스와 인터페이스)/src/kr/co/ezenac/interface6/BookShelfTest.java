package kr.co.ezenac.interface6;
/*/
 *  책이 순서대로 대여되는 도서관
 *  책 보관하는 자료구조: ArrayList
 *  
 *  Shelf 클래스를 상속받고 Queue를 구현
 */
public class BookShelfTest {

	public static void main(String[] args) {
		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("데이터 플랫폼 설계와 구축1");
		bookQueue.enQueue("데이터 플랫폼 설계와 구축2");
		bookQueue.enQueue("데이터 플랫폼 설계와 구축3");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		
	}

}
