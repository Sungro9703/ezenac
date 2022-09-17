package kr.co.ezenac.generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();		// 형변환하지 않음
		System.out.println(powder);
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();		// 형변환하지 않음
		System.out.println(plastic);
		
		GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
	}

}
