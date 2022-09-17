package kr.co.ezenac.generic2;

public class Powder extends Material {

	@Override
	public String toString() {
		return "재료는 Powder입니다.";
	}
	
	@Override
	public void doPrinting() {
		System.out.println("Powder로 프린팅합니다.");

	}

}
