package mikeheke.studycode.designpattern.templatemethod2;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Client2 {

	public static void main(String[] args) {

		SimpleJdbcQueryTemplate jdbcTemplate = new SimpleJdbcQueryTemplate();

		String str = jdbcTemplate.query("select username from T_USER",
						new ResultSetHandler<String>() {
		
							public String handle(ResultSet rs) {
								try {
									if (rs.next()) {
										return rs.getString("username");
									}
								} catch (SQLException e) {
									e.printStackTrace();
								}
								return null;
							}
		
						});
		
		System.out.println(str);
		
		//=====================================================================================================
		
		Boolean flag = jdbcTemplate.query("select username from T_USER where username = 'mary'",
				new ResultSetHandler<Boolean>() {

					public Boolean handle(ResultSet rs) {
						try {
							if (rs.next()) {
								return true;
							}
						} catch (SQLException e) {
							e.printStackTrace();
						}
						return false;
					}

				});
		
		System.out.println("flag: "+flag);
		

	}

}
