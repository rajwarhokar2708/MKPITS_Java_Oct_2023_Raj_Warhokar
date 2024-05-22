package com.mkpits.loops;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcClassPracticeUpdate3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits_student", "root", "");
			PreparedStatement stmt = conn.prepareStatement("update student set first_name=? last_name=? email=? where id=?");
			
			stmt.setString(1, "khausthub");
			stmt.setString(2, "Anjankar");
			stmt.setString(3, "khaus@gmail.com");
			stmt.setInt(4, 8);

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
