package kr.co.ezenac.treeset2;


public class MemvberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberLee = new Member(1001,"이방원");
		Member memberHa = new Member(1002,"하륜");
		Member memberSunk = new Member(1003,"이숙번");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberHa);
		memberTreeSet.addMember(memberSunk);
		memberTreeSet.ShowAllMember();
		
		memberTreeSet.removeMemver(1000);
		
		memberTreeSet.removeMemver(1001);
		memberTreeSet.ShowAllMember();
		
		Member memberHwang = new Member(1003, "이숙번");
		memberTreeSet.addMember(memberHwang);
		memberTreeSet.ShowAllMember();
	}

}
