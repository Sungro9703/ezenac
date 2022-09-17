package kr.co.ezenac.stack;

public class MyArrayStackTest {

	public static void main(String[] args) {
		MyArrayStack stack = new MyArrayStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		stack.printAll();
		stack.top();
		System.out.println("스택 사이즈: " + stack.getSize());
		stack.printAll();
		
	}

}
