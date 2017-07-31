package com.weirong.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class ReviewTest {

	@Test
	public void testGetConnection() throws ClassNotFoundException, SQLException {
		//1. ׼����ȡ���ӵ�4���ַ���
		String user = "root";
		String password = "bottle19920314";
		String jdbcUrl = "jdbc:mysql://localhost:3306/mysql";
		String driverClass = "com.mysql.jdbc.Driver";
		
		
		//2. ��������
		Class.forName(driverClass);
		
		//3.����DriverManager�ķ�����ȡ���ݿ������
		Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
		
		System.out.println(connection);
	}

	@Test
	public void testGetConnection2() throws ClassNotFoundException, SQLException {
		String user = "scott";
		String password = "tiger";
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String driverClass = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driverClass);
		
		Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
		
		System.out.println(connection);
	}
}
