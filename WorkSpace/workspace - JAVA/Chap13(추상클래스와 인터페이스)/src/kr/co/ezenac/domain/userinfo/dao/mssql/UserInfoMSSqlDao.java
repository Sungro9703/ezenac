package kr.co.ezenac.domain.userinfo.dao.mssql;

import kr.co.ezenac.domain.userinfo.UserInfo;
import kr.co.ezenac.domain.userinfo.dao.UserInfoDao;

public class UserInfoMSSqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into MSSql DB userId" + userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("insert into MSSql DB userId" + userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("insert into MSSql DB userId" + userInfo.getUserId());
		
	}

}
