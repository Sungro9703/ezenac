package kr.co.ezenac.total;

public class Card {
	
	// static - 공용데이터로 활용
	static final int KIND_MAX = 4;		//카드 무늬 개수
	static final int NUM_MAX = 13;		//무늬별 카드 수
	
	//무늬를 상수로 지정
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	//생성자
	public Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public String toString() {
		//지역 변수는 반드시 초기화
		String kind = "";
		String number = ""; 
		
		//무늬 설정
		switch(this.kind) {
			case 4:
				kind = "스페이드";
				break;
			case 3:
				kind = "다이아몬드";
				break;
			case 2: 
				kind = "하트";
				break;
			case 1:
				kind = "클로버";
				break;
		}
		
		//숫자설정
		switch(this.number) {
			case 13:
				number = "K";
				break;
			case 12:
				number = "Q";
				break;
			case 11:
				number = "J";
				break;
			default:
				number = this.number +"";
		}
		
		return "무늬: " + kind + " 숫자: " + number;
	}
	
}

	
	