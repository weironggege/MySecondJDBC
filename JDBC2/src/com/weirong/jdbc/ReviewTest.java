package com.weirong.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class ReviewTest {

	@Test
	public void testGetConnection() throws ClassNotFoundException, SQLException {
		//1. 准备获取连接的4个字符串
		String user = "root";
		String password = "bottle19920314";
		String jdbcUrl = "jdbc:mysql://localhost:3306/mysql";
		String driverClass = "com.mysql.jdbc.Driver";
		
		
		//2. 加载驱动
		Class.forName(driverClass);
		
		//3.调用DriverManager的方法获取数据库的连接
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
