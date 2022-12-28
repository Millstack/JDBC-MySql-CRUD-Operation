package comp.jsp.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String username = "root";
		String password = "root";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			establish the connection
			String sql = "INSERT INTO PRODUCT VALUES (9, 'Tata', 'EV')";
			Connection connection = DriverManager.getConnection(url, username, password);	
			
//			Create a statement
			Statement statement = connection.createStatement();
			
//			Execute a statement / Query
			statement.execute(sql);
			
//			Close the connection
			connection.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
		 finally { connection.close(); }
		 */
	}
}
