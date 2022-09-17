package kr.co.ezenac.decision;

public class IfIfElse {

	public static void main(String[] args) {
		int score = 91;
		
		// 수십개의 if문이 존재하더라도, CPU는 모든 if문을 참조함 => 비효율적 코드
		if(score > 90) {
			System.out.println("점수가 90점 보다 큽니다.");
			System.out.println("학점은 A학점입니다.");
		}
		
		if(score > 80) {
			System.out.println("점수가 80점 보다 큽니다.");
			
		}
		
		if(score > 92) {
			System.out.println("점수가 92점 보다 큽니다.");
		}
		
		System.out.println();
		
//		if~else 구문은 50% 확률일 떄, 사용하는 것이 바람직
		
		if(score >= 90)	{
			System.out.println("90점 이상입니다.");
		}
		else {
			System.out.println("90점 미만입니다.");
		}
		
		
		
		
		
		
		
		

	}

}
