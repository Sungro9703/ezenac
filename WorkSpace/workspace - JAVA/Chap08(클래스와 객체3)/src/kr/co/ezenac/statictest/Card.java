package kr.co.ezenac.statictest;

public class Card extends Object {
	
	// 인스턴스 변수 -- 인스턴스 생성해야 접근 가능
	private String color;
	private String company;
	
	// static 변수 (정적변수, 클래스 변수, 공유변수)
	static int width = 100;
	static int height = 50;
	
	// get, set
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	// 오버라이드 toString()
	@Override
	public String toString() {
		
		return "Card의 색상: " + this.getColor() +
				",Card의 회사: " + this.getCompany() +
				", 크기: (" + Card.height + 
				", " + Card.width + ")";
	}
}
