package kr.co.ezenac.statictest;

public class CardTest {

	public static void main(String[] args) {
		
		Card card = new Card();
		card.setColor("노랑");
		card.setCompany("KB은행");
		System.out.println(card);
		
		Card.height = 150;
		Card.width = 80;
		
		Card card2 = new Card();
		card2.setColor("파랑");
		card2.setCompany("농협");
		System.out.println(card2);
		
	}
}
