package comp.jsp.query;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Query {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String username = "root";
		String password = "root";
		String sql = "SELECT * FROM PRODUCT";
		
		try {
			//load or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// establish connection
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("connection establishd");
			
			//create statement
			Statement statement = connection.createStatement();
			
			//execute the statement
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				System.out.println("============");
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("============");
			}
			
			connection.close();
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
