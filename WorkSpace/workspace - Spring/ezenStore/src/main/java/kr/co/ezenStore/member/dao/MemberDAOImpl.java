package kr.co.ezenStore.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import kr.co.ezenStore.member.dto.MemberDTO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public String selectDuplicateCheck(String id) throws DataAccessException {
		String result = sqlSession.selectOne("mapper.member.duplicatecheck", id);
		return result;
	}

	@Override
	public int addMember(MemberDTO memberDTO) throws Exception {
		int result = sqlSession.insert("member.addMember", memberDTO);
		System.out.println("hello");
		return result;
	}

}
