package kr.co.springmybatis.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import kr.co.springmybatis.dto.MemberDTO;

public interface MemberDAO {

	public List<MemberDTO> selectAllMemberList() throws DataAccessException;
	public int insertMember(MemberDTO memberDTO) throws DataAccessException;
	public int deleteMember(String id) throws DataAccessException;
}
