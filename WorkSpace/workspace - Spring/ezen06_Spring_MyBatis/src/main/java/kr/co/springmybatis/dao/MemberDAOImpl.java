package kr.co.springmybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;

import kr.co.springmybatis.dto.MemberDTO;

public class MemberDAOImpl implements MemberDAO {
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<MemberDTO> selectAllMemberList() throws DataAccessException {
	 	List<MemberDTO> membersList = sqlSession.selectList("mapper.member.selectAllMemberList");		
		return membersList;
	}

	@Override
	public int insertMember(MemberDTO memberDTO) throws DataAccessException {
		int result = sqlSession.insert("mapper.member.insertMember", memberDTO);
		return result;
	}

	@Override
	public int deleteMember(String id) throws DataAccessException {
		// 주입된 sqlSession 빈으로 delete()를 호출하면서 SQL문의 id와 회원 ID를 전달함
		int result = sqlSession.delete("mapper.member.deleteMember", id);
		return result;
	}
}

















