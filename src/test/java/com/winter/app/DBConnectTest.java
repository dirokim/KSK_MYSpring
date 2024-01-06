package com.winter.app;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public class DBConnectTest {

	@Autowired
	private DataSource dataSource;
	
	public void connectTest() throws Exception { 
		Connection con = dataSource.getConnection();
		assertNotNull(con);
	}
}
