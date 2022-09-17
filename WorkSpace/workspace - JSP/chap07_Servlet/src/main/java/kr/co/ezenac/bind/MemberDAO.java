package kr.co.ezenac.bind;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MemberDAO {

//	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
//	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
//	private static final String USER = "ezen";
//	private static final String PWD = "0824";
	
	private Connection conn;			// 데이터베이스와 연결을 담당
	private Statement stmt;				// 정적 쿼리문 실행할 때 사용
	private PreparedStatement pstmt;	// 동적 쿼리문 실행할 때 사용
	private ResultSet rs;				// select 
	private DataSource dataFactory;
	
//	public void connDB() {
//		try {
//			Class.forName(DRIVER);
//			System.out.println("Oracle 드라이버 로딩 성공");
//			
//			conn = DriverManager.getConnection(URL, USER, PWD);
//			System.out.println("Connection 생성 성공");
//			
//			
//			} catch (Exception e){
//				e.printStackTrace();
//		}
//	}
	
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
	
	public MemberDAO() {
		try {
			
			// 커넥션 풀(DataSource) 얻기
			/* Context : 자바의 네이빙 서비스(JNDI)에서 이름과 실제 객체를 연결해주는 개념
			 * InitialContext는 네이밍 서비스를 이용하기 위한 시작점 */
			Context ctx = new InitialContext();		// InitialContext 객체 생성
			
			/* java:comp/env	-	현재 웹 애플리케이션의 루트 디렉토리 
			 * 현재 웹 애플리케이션이 사용할 수 있는 모든 자원은 java:comp/env 아래에 위치 */
			Context envContext = (Context)ctx.lookup("java:comp/env");
			
			//java:comp/env 아래에 위치한 java:comp/env 자원을 얻어옴
			dataFactory = (DataSource)envContext.lookup("jdbc/oracle");
			
			
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<>();
		
//		connDB();
		
		String query = "SELECT * FROM T_MEMBER";
		System.out.println(query);
		
		try {
			// 커넥션 풀을 통해 연결 얻기
			conn = dataFactory.getConnection();
			
			pstmt = conn.prepareStatement(query);
			
			/* select 쿼리문을 실행할 때 사용
			 * 조회한 레코드들의 집합인 ResultSet 객체를 반환 */
			rs = pstmt.executeQuery();		//미리 설정된 SQL문 실행
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

	public void addMember(MemberVO memberVO) {
		
		try {
			conn = dataFactory.getConnection();
			
			String id = memberVO.getId();
			String pwd = memberVO.getPwd();
			String name = memberVO.getName();
			String email = memberVO.getEmail();
			
			String query = "INSERT INTO T_MEMBER(ID, PWD, NAME, EMAIL) VALUES (?, ?, ?, ?)";
			System.out.println("PrepareStatement : " + query);
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, id);		//insert문의 ?에 순서대로 회원정보 세팅
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			
			pstmt.executeUpdate();		// 회원 정보 테이블에 추가
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void delMember(String id) {
		try {
			conn = dataFactory.getConnection();
			
			String query = "DELETE FROM T_MEMBER WHERE ID = ?";		//delete문을 문자열로 만듦
			System.out.println(query);
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);  		// 첫번째 '?'에 전달된 id를 인자로 넣음
			pstmt.executeUpdate();			// delete 문 실행 → 테이블에서 해당 id 회원 정보 삭제
			close();

		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	
}
