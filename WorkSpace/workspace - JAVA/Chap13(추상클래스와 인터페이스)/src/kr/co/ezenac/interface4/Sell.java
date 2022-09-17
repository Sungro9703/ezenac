package kr.co.ezenac.interface4;

public interface Sell {
	void sell();
	default void order() {
		System.out.println("판매 주문");
	}
}
