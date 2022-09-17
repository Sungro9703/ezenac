package kr.co.ezenac.loop2;

public class ContinueTest2 {

	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		
		while((num++) <= 100) {
//			if(num % 2 != 0)
//				continue;
//			if(num % 3 != 0)
//				continue;
			
			if((num % 2 != 0) || (num % 3 != 0))
				continue;
			
			count++;
			System.out.println(num);
		}
		System.out.println("count: " + count);
	}

}
