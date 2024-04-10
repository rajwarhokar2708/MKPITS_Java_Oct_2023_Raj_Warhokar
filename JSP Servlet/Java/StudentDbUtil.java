package com.mkpits.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class StudentDbUtil {
	private DataSource dataSource;

	public StudentDbUtil(DataSource datasource) {
		this.dataSource = datasource;
	}

	public List<Student> getStudent(){
		List<Student> student=new ArrayList<>();
		
		Connection myConn=null;
		Statement myStmt=null;
		ResultSet myRs=null;
		
		try {
			myConn = dataSource.getConnection();
			// create a sql statement
			String sql = "select* from student";
			myStmt = myConn.createStatement();

			// execute sql query
			myRs = myStmt.executeQuery(sql);

			// process the result set
			while (myRs.next()) {
				
				int id=myRs.getInt("id");
						String firstName=myRs.getString("first_name");
						String lastName=myRs.getString("last_name");
						String email=myRs.getString("email");
						
						//create new Student Object
						Student tempStudent=new Student(id,firstName, lastName, email);
						
						//add it to the list of student
						student.add(tempStudent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Close(myConn,myStmt,myRs);
		}
		return student;
		}

	private void Close(Connection myConn, Statement myStmt, ResultSet myRs) {
		try {
			if(myRs !=null) {
				myRs.close();
			}
			if(myStmt !=null) {
				myRs.close();
			}
			if(myConn !=null) {
				myRs.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}


