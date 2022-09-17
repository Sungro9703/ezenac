package kr.co.ezenac.inheritance;

import java.awt.print.Printable;

public class MountainBike extends Bicycle{

	String frame;
	int gear;
	int price;
	
	public void print() {
		System.out.println("id: " + this.id);
		System.out.println("brand: " + this.brand);
		System.out.println("frame: " + this.frame);
		System.out.println("gear: " + this.gear);
		System.out.println("price: " + this.price);
		System.out.println("owner: " + this.owner);
		
	}
	
	public static void main(String[] args) {
		MountainBike mbike = new MountainBike();
		mbike.id = 824;
		mbike.brand = "LESPO";
		mbike.frame = "알루미늄";
		mbike.gear = 33;
		mbike.price = 300000;
		mbike.owner = "이순신";
	
		mbike.print();
	}
}
