package kr.co.ezenac.inheritance3;

//부모 클래스
class Unit{
	String name;
	int hp;
	
	public void printUnit(){
		System.out.println("이름: " + name);
		System.out.println("hp: " + hp);
	}
}

// 자식 클래스
class Marine extends Unit{
	int attack;
	
	public void printMarine() {
		printUnit();
		System.out.println("공격력: " + attack);
	}
}

// 자식 클래스
class Medic extends Unit{
	int heal;
	
	public void printMedic() {
		printUnit();
		System.out.println("치유량: " + heal);
	}
}

public class MyGame {

	public static void main(String[] args) {
		Marine marine = new Marine();
		marine.name = "마린";
		marine.hp = 100;
		marine.attack = 20;
		
		Medic medic = new Medic();
		medic.name = "메딕";
		medic.hp = 120;
		medic.heal = 10;
		
		marine.printMarine();
		System.out.println();
		medic.printMedic();
		
	}

}
