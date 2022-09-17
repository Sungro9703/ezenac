package kr.co.ezenac.session02;

import java.sql.Date;

/*
 * id			varchar2(10)		PRIMARY KEY
	,pwd		varchar2(10)
	,name		varchar2(50)
	,email		varchar2(50)
	,joinDate	DATE DEFAULT SYSDATE
 */
public class MemberVO {
	/* t_member 테이블의 동일한 컬럼이름, 자료형 */
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date joindate;
	
	public MemberVO() {
		System.out.println("MemberVO 생성자 호출");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	
	
	
}
