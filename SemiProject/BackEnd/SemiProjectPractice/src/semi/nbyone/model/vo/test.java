package semi.nbyone.model.vo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SEMI","SEMI");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM MEMBER WHERE userId = 'admin'");
			System.out.println("jackson");
			if(rs.next()) {
				System.out.println(rs.getString(1)+ " : " + rs.getString(2));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
