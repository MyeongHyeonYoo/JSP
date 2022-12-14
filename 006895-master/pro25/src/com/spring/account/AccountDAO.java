package com.spring.account;

import org.apache.ibatis.session.SqlSession;
import org.springframework.dao.DataAccessException;

public class AccountDAO {
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public void updateBalance1() throws DataAccessException {
		AccountVO accountDTO = new AccountVO("70-490-930","ȫ�浿",5000000);
		sqlSession.update("mapper.account.updateBalance1");
	}
	
	public void updateBalance2() throws DataAccessException {
		AccountVO accountDTO = new AccountVO("70-490-911","������",5000000);
		sqlSession.update("mapper.account.updateBalance2");
	}
	

}
