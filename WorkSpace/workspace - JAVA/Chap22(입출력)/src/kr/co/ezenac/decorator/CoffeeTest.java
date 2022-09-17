package kr.co.ezenac.decorator;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee aamericano = new AAmericano();
		aamericano.brewing();
		System.out.println();
		
		Coffee ezenlatte = new Latte(aamericano);
		ezenlatte.brewing();
		System.out.println();
		
		Coffee ezenMocha = new Mocha(new Latte(new AAmericano()));
		ezenMocha.brewing();
		System.out.println();
		
		Coffee ezenITMocha = new Mocha(new Latte(new BAmericano()));
		ezenITMocha.brewing();
	}

}
