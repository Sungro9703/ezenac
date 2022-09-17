package kr.co.ezenac.field;

public class FieldInit {
	
	//기본형 변수
	byte byteField;			//1byte
	short shortField;		//2byte
	int intField;			//4byte
	long longField;			//8byte
	
	boolean booleanField;	//1byte
	char charField;			//2byte
	
	float floatField;		//4byte
	double doubleField;		//8byte
	
	//참조형 변수
	String strField;		//4byte
	int[] arrField;			//4byte
	
	@Override
	public String toString() {
		
		String str = "shortField: " + shortField +
					", intField: " + intField +
					", charField: "+ charField +
					", strField: " + strField;
		
		return str;
	}
	
}
