package kr.co.ezenac.string;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder buffer = new StringBuilder("학교종이 땡땡땡");
		
		buffer.append(" 어서모이자.");
		System.out.println(buffer.toString());
		
		buffer.append(12345);
		System.out.println(buffer.toString());
		
		buffer.delete(0,4);
		System.out.println(buffer.toString());
		
		buffer.replace(4, 8, "ABC");
		System.out.println(buffer.toString());
		
		buffer.reverse();
		System.out.println(buffer.toString());
	}

}
