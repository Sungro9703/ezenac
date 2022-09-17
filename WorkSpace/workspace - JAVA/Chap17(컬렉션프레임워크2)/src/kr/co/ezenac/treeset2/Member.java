package kr.co.ezenac.treeset2;

import java.util.Comparator;

public class Member implements Comparable<Member>{
	
	private int memberID;
	private String memberName;
	
	public Member() {}

	public Member(int memberID, String memberName) {
//		super();
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberID + "입니다.";
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode() 호출");
		return memberID;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return this.memberID == member.memberID;
		}
		return false;
	}

	
	// name 기준으로 오름차순
	@Override
	public int compareTo(Member member) {
		
		return this.memberName.compareTo(member.getMemberName());	//이름으로 정렬
	}

	
	
	
	// id로 정렬 / 양수면 오름차순, 음수면 내림차순
	// (-1) 곱해주면 내림차순 정렬
	// implements Comparator<Member>
//	
//	@Override
//	public int compare(Member member1, Member member2) {
//		
//		return (member1.memberID - member2.memberID)*(-1);
//	}
	
	
	
	
}
