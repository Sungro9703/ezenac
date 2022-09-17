package kr.co.ezenac.autoCloseable;

public class AutocloseTest {

	public static void main(String[] args) {
		
		AutoCloseable obj = new AutoCloseObject();
		
		try(AutoCloseable obj2 = obj) {
			throw new Exception();
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
