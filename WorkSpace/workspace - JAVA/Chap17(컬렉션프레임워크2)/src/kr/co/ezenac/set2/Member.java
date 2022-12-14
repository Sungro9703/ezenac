package kr.co.ezenac.set2;

public class Member {
	
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
	
	
	
	
}
