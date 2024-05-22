package com.mkpits.loops;

import java.sql.*;

public class JdbcClassPractice {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits_student","root","");
			Statement stmt= conn.createStatement();
			ResultSet rs=  stmt.executeQuery("select * from student");
			
			while (rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)); 
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
