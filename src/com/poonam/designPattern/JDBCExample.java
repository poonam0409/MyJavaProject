package com.poonam.designPattern;

import java.sql.DriverManager;
import java.sql.*;

public class JDBCExample {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "1234");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select studentname from student where rollnumber =3");
		rs.next();
		String student = rs.getString(1);
		System.out.println("City name " + student);

		stmt.close();
		con.close();

	}

}
