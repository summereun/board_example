package org.jeh.dbTest;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;


public class JDBCTest {
	private static final String DRIVER="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://127.0.0.1:3306/dbtest?serverTimezone=Asia/Seoul";
	private static final String USER="root";
	private static final String PW="1234";
	
	// 테스트와 관련된 어노테이션(@)
	// @RunWith
	// @ContextConfigueration
	// @Test
	// 테스트용 메서드이고, 그걸 java에 인식 시켜주어야함(컴파일 할 때)
	// 오버라이딩 기법이 들어간 메소드임을 알려야 함
	
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		try(Connection con=DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
