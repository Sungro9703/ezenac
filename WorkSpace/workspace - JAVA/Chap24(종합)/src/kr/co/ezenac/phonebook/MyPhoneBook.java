package kr.co.ezenac.phonebook;

import java.io.Serializable;

// 인터페이스 추가하여 직렬화 기능에 의해 저장될 수 있음
public class MyPhoneBook implements Serializable{

	private static final long serialVersionUID = 4044239832550429600L;
	String name;
	String phoneNum;
	String email;

	public MyPhoneBook(String name, String phoneNum, String email) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public MyPhoneBook(String name, String phoneNum) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
	}

	public void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("PhoneNum: " + phoneNum);
		if (email != null) {
			System.out.println("Email:" + email);
			System.out.println();
		}
	}
}
