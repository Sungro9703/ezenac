package kr.co.springmybatis.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import kr.co.springmybatis.dto.MemberDTO;

public interface MemberService {
	public List<MemberDTO> listMembers() throws DataAccessException;
	public int addMember(MemberDTO memberDTO) throws DataAccessException;
	public int removeMember(String id) throws DataAccessException;
}
