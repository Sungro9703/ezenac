package kr.co.ezenac.decision;

/*
 *  ID:
 *  PW:
 *  
 *  id가 ADMIN_ID
 *  pw가 ADMIN_PASSWORD
 *  
 *  <출력>
 *  관리자 로그인 성공
 *  로그인 실패
 */ 



import java.util.Scanner;

public class IfElse {
	static final String ADMIN_ID = "admin";
	static final String ADMIN_PASSWORD = "0318";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ID: ");
		String id = scan.nextLine();
		
		System.out.print("PW: ");
		String pw = scan.nextLine();
		
		if(id.equals(ADMIN_ID) && pw.equals(ADMIN_PASSWORD)) {
			System.out.println("관리자 로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		scan.close();
		
	} 

}


