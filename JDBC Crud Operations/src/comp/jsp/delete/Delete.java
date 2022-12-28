package comp.jsp.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String username = "root";
		String password = "root";
		String sql = "DELETE FROM PRODUCT WHERE ID = 6";
		
		
		try {
			
//			load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			establish a connection
			Connection conn = DriverManager.getConnection(url, username, password);
			
//			create a statement
			Statement statement = conn.createStatement();
			
//			execute a statement / query
			int a = statement.executeUpdate(sql);
			
			if (a > 0) {
				System.out.println("Record Deleted successfully");
			}else System.out.println("Record is not Deleted");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
