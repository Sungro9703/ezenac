package kr.co.ezenac.criticalsection;

class Bank {
	private int money = 10000;
	
	
	
	public int getMoney() {
		return money;
	}



	public void setMoney(int money) {
		this.money = money;
	}



	public synchronized void saveMoney(int save) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m + save);
	}
	
	public synchronized void minusMoney(int minus) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m - minus);
	}
}

class PersonA extends Thread {
	
	@Override
	public void run() {
		System.out.println("start save");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("saveMoney(3000): " + SyncMain.myBank.getMoney());
	}
}

class PersonB extends Thread {
	
	@Override
	public void run() {
		System.out.println("start minus");
		SyncMain.myBank.minusMoney(1000);
		System.out.println("minusMoney(1000): " + SyncMain.myBank.getMoney());
	}
}

public class SyncMain {
	
	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws InterruptedException {
		PersonA pA = new PersonA();
		pA.start();
		
		Thread.sleep(200);
		
		PersonB pB = new PersonB();
		pB.start();

	}

}
