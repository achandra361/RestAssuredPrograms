package jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class MySqlTest {
	
	@Test
	public static void JdbcmySqlTest() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/animeshdb","root","Rikki@361#");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from Persons");
		while(rs.next()) { 
			System.out.println(rs.getInt(1)+" - "+rs.getString(2)+" - "+rs.getString(3)+"  -"+rs.getString(4)+" - "+rs.getString(5));  
			
		}
		
		con.close();
	}
	
	public static void main(String[] args) {
		
}
}
