package com.weirong.jdbc;

import java.sql.PreparedStatement;


import org.junit.Test;

import com.mysql.jdbc.Connection;

public class JDBCTest {

	@Test
	public void testPreparedStatement() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = JDBCTools.getConnection();
			
			String sql = "insert into customer (ID, name, email) values(?, ?, ?)";
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "weiyu");
			preparedStatement.setString(3, "weiyu@qq.com");
			//preparedStatement.setDate(4, (java.sql.Date) new Date(new java.util.Date().getTime()));
			
			preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			JDBCTools.release(preparedStatement, connection, null);
		}
	}

}
