package kr.co.ezenac.decision2;

public class SwitchTest2 {

	public static void main(String[] args) {
		
		String str = "회장";
		
		switch(str)	{
		case "부장" :
			System.out.println("450만원");
			break;
		case "차장" :
			System.out.println("400만원");
			break;
		case "과장" :
			System.out.println("350만원");
			break;
		case "대리" :
			System.out.println("250만원");
		case "사원" :
			System.out.println("200만원");
			break;
		default:
			System.out.println("없는 직급입니다.");

	}

}
}
