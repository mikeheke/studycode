package mikeheke.studycode.designpattern.templatemethod2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleJdbcQueryTemplate {

	public static final String url = "jdbc:mysql://127.0.0.1:23306/test";
	public static final String name = "com.mysql.jdbc.Driver";
	public static final String user = "mike";
	public static final String password = "mike";

	
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(name);// 指定连接类型
			conn = DriverManager.getConnection(url, user, password);// 获取连接
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
	
	public <T> T query(String queryString, ResultSetHandler<T> rsHandler) {
		
		Connection conn = getConnection();
		
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(queryString);
			
			return rsHandler.handle(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return null;
	}
	
	
	

	public static void main(String[] args) {
		String sql = "select username from T_USER";
		
		Connection conn = new SimpleJdbcQueryTemplate().getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String username = rs.getString("username");
				System.out.println("username: "+username);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
