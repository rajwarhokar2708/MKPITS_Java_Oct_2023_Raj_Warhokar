package com.mkpits.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class DbUtility {
	private static DataSource dataSource;

	public DbUtility(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	private static void close(Connection myConn, Statement myStmt, ResultSet myRs) {
		try {
			if (myRs != null) {
				myRs.close();
			}
			if (myStmt != null) {
				myStmt.close();
			}
			if (myConn != null) {
				myConn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void addCustomer(Customer_Model theCustomer) {
		Connection myConn = null;
		PreparedStatement myStmt = null;

		try {
			// get db connection
			myConn = dataSource.getConnection();

			// create sql for insert
			String sql = "insert into customer_data(name,email,gender,city,mobile_no,password) values(?,?,?,?,?,?)";
			myStmt = myConn.prepareStatement(sql);

			// set the param values for the student
			myStmt.setString(1, theCustomer.getName());
			myStmt.setString(2, theCustomer.getEmail());
			myStmt.setString(3, theCustomer.getGender());
			myStmt.setString(4, theCustomer.getCity());
			myStmt.setString(5, theCustomer.getMobile_no());
			myStmt.setString(6, theCustomer.getPassword());

			// execute SQL insert
			myStmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(myConn, myStmt, null);
		}
		
	}
	
	
//	public String getDetails(String inputEmail, String inputPassword) {
//		String message = null ;
//		Connection myConn = null;
//		Statement myStmt = null;
//		ResultSet myRs = null;
//		
//		try {
//			myConn = dataSource.getConnection();
//			
//			String sql = "select email, password from customer_data";
//			
//			myStmt = myConn.createStatement();
//			
//			myRs = myStmt.executeQuery(sql);
//			
//			while (myRs.next()) {
//				String email_db=myRs.getString("email");
//				String password_db=myRs.getString("password");
//				
//				if(email_db.equals(inputEmail)&&password_db.equals(inputPassword)) {
//					message="Login Successful";
//					break;
//					
//				}else {
//					message="Login UnSuccessful";
//				}
//				
//			}
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			close(myConn, myStmt, myRs);
//		}
//		return message;
//	}

}
