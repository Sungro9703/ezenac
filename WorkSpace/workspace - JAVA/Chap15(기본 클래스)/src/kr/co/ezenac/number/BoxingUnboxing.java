package kr.co.ezenac.number;

public class BoxingUnboxing {

	public static void main(String[] args) {
		// boxing
		Integer iObj = Integer.valueOf(10);
		
		Double dObj = Double.valueOf(3.14);
		
		//unboxing
		int num1 = iObj.intValue();
		double num2 = dObj.doubleValue();
		
		System.out.println(num1 + " : " + iObj);
		System.out.println(num2 + " : " + dObj);
	
		//auto boxing
		Integer iObj2 = 10;
		Double dObj2 = 3.14;
		
		//auto unboxing
		int num3 = iObj2;
		double num4 = dObj2;
		
	}

}
