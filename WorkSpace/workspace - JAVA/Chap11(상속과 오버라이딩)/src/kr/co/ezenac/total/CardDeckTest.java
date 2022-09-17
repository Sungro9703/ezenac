package kr.co.ezenac.total;

public class CardDeckTest {

	public static void main(String[] args) {
		// 생성자보다 초기화 블럭이 먼저 실행됨
		Deck deck = new Deck();
		
		Card card = deck.pick(0);
		System.out.print("카드 섞기 전 제일 위에 있는 카드 → ");
		System.out.println(card.toString());
		
		card = deck.pick(33);
		System.out.print("카드 섞기 전 34번째에 있는 카드 → ");
		System.out.println(card.toString());
		
		System.out.println();
		
		deck.shuffle(); 
		card = deck.pick(0);
		System.out.print("카드 섞은 후 제일 위에 있는 카드 → ");
		System.out.println(card.toString());
		
		card = deck.pick(33);
		System.out.print("카드 섞은 후 34번째에 있는 카드 → ");
		System.out.println(card.toString());
		
	}

}
