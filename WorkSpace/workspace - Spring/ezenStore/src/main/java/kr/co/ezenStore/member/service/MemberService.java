package kr.co.ezenStore.member.service;

import kr.co.ezenStore.member.dto.MemberDTO;

public interface MemberService {

	public String duplicateCheck(String id) throws Exception;

	public int addMember(MemberDTO memberDTO) throws Exception;
}
