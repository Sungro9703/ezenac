package kr.co.ezenac.etc;

interface Unit2{
	@Deprecated
	void move(String str);
	void run(String str);
}

class Horse2 implements Unit {

	@Override
	@SuppressWarnings("deprecation")
	public void move(String str) {
		System.out.println(str);
		
	}

	@Override
	public void run(String str) {
		System.out.println(str);
		
	}
	
}

public class SuppressWarningsTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Unit unit = new Horse();
		unit.move("이동합니다.");
		unit.run("달립니다.");

	}

}
