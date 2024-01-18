package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Demo1 {

	public static void main(String[] args) {

		Connection conn = null;
		
		// step1

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step2

		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware_db", "root", "admin");

			// step3

			String insert = "insert into Employees(eid,ename,salary,job) values(112,'Don',70000,'MD')";

			Statement stmt = conn.createStatement();

			int count = stmt.executeUpdate(insert);

			System.out.println(count + " records effected");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
			conn.close();
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
