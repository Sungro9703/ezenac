package kr.co.ezenac.interface1;

public class RemoteTest {

	public static void main(String[] args) {
		RemoteControl rControl = new AudioRemote();
		rControl.turnOn();
		rControl.setVolume(15);
		rControl.setVolume(-50);
		rControl.turnOff();
		
		System.out.println();
		
		rControl = new Television();
		rControl.turnOn();
		rControl.setVolume(20);
		rControl.setVolume(-100);
		rControl.turnOff();

	}

}
