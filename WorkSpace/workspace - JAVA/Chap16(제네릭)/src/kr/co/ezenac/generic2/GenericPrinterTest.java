package kr.co.ezenac.generic2;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Material> powderPrinter = new GenericPrinter<>();
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter);
		
//		GenericPrinter<Water> waterGenericPrinter = new GenericPrinter<>();
		GenericPrinter<Plastic> platsticPrinter = new GenericPrinter<>();
		Plastic plastic = new Plastic();
		platsticPrinter.setMaterial(plastic);
		System.out.println(platsticPrinter);
		
	}

}
