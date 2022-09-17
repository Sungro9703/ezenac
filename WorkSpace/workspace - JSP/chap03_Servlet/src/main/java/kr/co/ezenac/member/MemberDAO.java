package kr.co.ezenac.member;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USER = "ezen";
	private static final String PWD = "0824";
	
	private Connection conn;			// 데이터베이스와 연결을 담당
	private Statement stmt;				// 정적 쿼리문 실행할 때 사용
	private PreparedStatement pstmt;	// 동적 쿼리문 실행할 때 사용
	private ResultSet rs;				// select 
	
	public void connDB() {
		try {
			Class.forName(DRIVER);
			System.out.println("Oracle 드라이버 로딩 성공");
			
			conn = DriverManager.getConnection(URL, USER, PWD);
			System.out.println("Connection 생성 성공");
			
			stmt = conn.createStatement();
			System.out.println("Statement 생성 성공");
			
			} catch (Exception e){
				e.printStackTrace();
		}
	}
	
	// 연결 해제 (자원 반납)
	public void close() {
		try {
			if(rs != null) rs.close();
			if(stmt != null) rs.close();
			if(pstmt != null) rs.close();
			if(conn != null) rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<>();
		
		connDB();
		
		String query = "SELECT * FROM T_MEMBER";
		System.out.println(query);
		
		try {
			rs = stmt.executeQuery(query);		//sql문으로 회원정보를 조회
			while(rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joindate");		// 조회한 레코드의 각 컬럼 값을 받아옴
			
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoindate(joinDate);			//각 컬럼 값을 다시 MemberVO 객체의 속성에 설정
				
				list.add(vo);						//설정된 MemberVO 객체를 다시 ArrayList에 저장
			}
			
			close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;				//조회한 레코드의 개수만큼 MemberVO 객체를 지정한 ArrayList를 반환
		
		
		
	}
	
}
