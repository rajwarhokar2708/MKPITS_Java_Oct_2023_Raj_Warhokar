package com.mkpits.loops;

import java.sql.*;

public class JdbcClassPractice2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits_student", "root", "");
			PreparedStatement stmt = conn.prepareStatement("insert into student values (?,?,?,?)");
			stmt.setInt(1, 9);
			stmt.setString(2, "khausthub");
			stmt.setString(3, "Anjankar");
			stmt.setString(4, "khaus@gmail.com");

			int i = stmt.executeUpdate();
			System.out.println(i + " record inserted");

			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getString(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
