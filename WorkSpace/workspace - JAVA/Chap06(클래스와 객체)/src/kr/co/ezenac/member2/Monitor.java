package kr.co.ezenac.member2;

public class Monitor {
	//멤버 변수(필드)
	String color;		// 모니터의 색상
	int channel;		// 채널
	int volume;			// 볼륨
	boolean power;		// 전원(on/off) 

	
	//멤버 메서드
	public void power() {
		if(!this.power) {
			System.out.println("모니터가 켜졌습니다");
			this.power = !power;
		}
		else {
			System.out.println("모니터가 꺼졌습니다");
			this.power = !power;
		}
	}
	
	
	//채널업(channel up())
	public void channelUp() {
		this.channel++;
		System.out.println("현재 채널: " + this.channel);
		}
		
	
	
	
	//채널다운(channel down())
	public void channelDown() {
		System.out.println("현재 채널: " + (--this.channel));
	}
	
}
