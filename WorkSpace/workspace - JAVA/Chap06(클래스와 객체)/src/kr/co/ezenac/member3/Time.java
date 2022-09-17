package kr.co.ezenac.member3;

/*
 * 1. 사용자 정의 클래스(User Define Class)
 *  - 서로 의미가 있으며, 관련된 데이터라면 묶어서 하나의 타입으로 정의할 수 있음
 *
 * 2. this의 사용
 *		- 유사한 의미로 사용되는 변수마다 이름을 각각 정의하는 것은 쉽지 않음.
 *		- 같은 이름을 사용하는데 멤버 변수임을 구분해주는 this를 사용함.
 *
 * 3. 클래스 코딩
 *		- 클래스는 대문자로 시작함
 *		- java 파일 하나에 클래스는 여러개가 있을 수 있지만,
 *		- public 클래스는 하나이고,
 *		  public 클래스와 .java 파일의 이름은 동일함.
 */
 		

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
//	getter(): 멤버 변수의 값을 읽어가는 메서드
//	setter(): 멤버 변수의 값을 수정하는 메서드
	
	public int getHour() {
		return this.hour;
	}
	public int getMinute() {
		return this.minute;
	}
	public int getSecond() {
		return this.second;
	}
	
	public void setHour(int hour) {
		//시에 대한 예외처리 코드 작성
		if(hour < 0 || hour > 23) {
			System.out.println("시간을 잘못 입력하셨습니다.");
			return;			//exit
		}
		this.hour = hour;
	}
	
	public void setMinute(int minute) {
		//분에 대한 예외처리 코드 작성
		if(minute < 0 || minute > 59) {
			System.out.println("분을 잘못 입력하셨습니다.");
			return;		
		}
		this.minute =minute;
	}
	
	public void setSecond(int second) {
		//초에 대한 예외처리 코드 작성
		if(second < 0 || second > 59) {
			System.out.println("초를 잘못 입력하셨습니다.");
			return;
		}
		this.second = second;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getHour() + "시 " +
				this.getMinute() + "분 " +
				this.getSecond() + "초";
	}
}