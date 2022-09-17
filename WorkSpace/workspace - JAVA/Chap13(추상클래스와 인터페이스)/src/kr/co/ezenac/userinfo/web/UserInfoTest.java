package kr.co.ezenac.userinfo.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import kr.co.ezenac.domain.userinfo.UserInfo;
import kr.co.ezenac.domain.userinfo.dao.UserInfoDao;
import kr.co.ezenac.domain.userinfo.dao.mssql.UserInfoMSSqlDao;
import kr.co.ezenac.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import kr.co.ezenac.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties properties = new Properties();
		properties.load(fis);
		
		String dbtype = properties.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("ezen");
		userInfo.setPasswd("0824");
		userInfo.setUserName("이순신");
		
		UserInfoDao userInfoDao = null;
		
		if(dbtype.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}
		else if (dbtype.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		}
		else if (dbtype.equals("MSSQL")) {
			userInfoDao = new UserInfoMSSqlDao();
		}
		else {
			System.out.println("db support error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}

}
