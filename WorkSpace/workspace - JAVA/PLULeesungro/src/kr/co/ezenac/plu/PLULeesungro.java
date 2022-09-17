package kr.co.ezenac.plu;

import java.util.Scanner;

public class PLULeesungro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		System.out.print("시작 단: ");
		int start = scan.nextInt();
		System.out.print("마지막 단: ");
		int end = scan.nextInt();
		
		
		System.out.print("시작 곱: ");
		int s = scan.nextInt();
		System.out.print("마지막 곱: ");
		int e = scan.nextInt();
		
		
		guguLeesungro(start, end, s, e);
		
		scan.close();
		
	}
	static void guguLeesungro(int start, int end, int s, int e) {
		for(int i=start; i<=end; i++) {
			System.out.println(i);
			for(int j=s; j<=e; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
	}	
}
		
	}

}
