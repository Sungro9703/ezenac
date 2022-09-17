package kr.co.ezenac.lambda5;

public class StringConcatTest {

	public static void main(String[] args) {
		// 일반 방식
		StringConcat impl = new StringConcatImpl();
		impl.makeString("Hello", " Ezen!");
		
		
		
		// 람다식
		StringConcat concat = (s, v) -> System.out.println(s + "," + v);
		concat.makeString("Hello", " Ezen!");
		
		
		// 익명 내부 클래스
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "," + s2);
				
			}
		};
		concat2.makeString("Hello", " Ezen!");
	}

}
