package com.mkpits.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class BooksDbUtility {

  private DataSource dataSource;
  
  public BooksDbUtility(DataSource dataSource) {
	  
	  this.dataSource = dataSource;
  }
  
  public List<Books_Model>  getBooks() throws Exception {
	  List<Books_Model> books = new ArrayList<>();
	 
	  Connection myConn = null;
	  Statement myStmt = null;
	  ResultSet myRs = null;
	  
	  try {
		  
		  myConn = dataSource.getConnection();
		  
		  //create a sql statement
		  String sql = "Select * from books order by id";
		  myStmt = myConn.createStatement();
		  
		  //execute sql query
		  myRs = myStmt.executeQuery(sql);
		  
		  //process the result set
		  while(myRs.next()) {
			  
			  //retrieve data from result set
			  int id = myRs.getInt("id");
			  String title = myRs.getString("title");
			  String author = myRs.getString("author");
			  String date = myRs.getString("date");
			  String genres = myRs.getString("genres");
			  String characters = myRs.getString("characters");
			  String synopsis = myRs.getString("synopsis");
//			  System.out.println(id);

			  
			  //create new student object
			  Books_Model tempStudent = new Books_Model(id, title, author, date, genres, characters, synopsis);
			  
			  //add it to the list of the student
			  books.add(tempStudent);
		  }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  } finally {
		  close(myConn, myStmt, myRs);
		  
	  }
	  return books;
	  
  }

private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
	try {
		if(myRs != null) {
			myRs.close();
		}
		if(myStmt != null) {
			myStmt.close();
		}
		if(myConn != null) {
			myStmt.close();
	}
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}

//public void addBooks(Books_Model theBooks) {
//	Connection myConn = null;
//	PreparedStatement myStmt = null;
//	
//	try {
//		//get db connection
//		myConn = dataSource.getConnection();
//		
//		//create sql for insert
//		String sql = "insert into student(first_name,last_name,email) values(?,?,?)";
//		myStmt = myConn.prepareStatement(sql);
//		
//		//set the param values for the student
//		myStmt.setString(1, theBooks.getTitle());
//		myStmt.setString(2, theBooks.getAuthor());
//		myStmt.setString(3, theBooks.getDate());
//		myStmt.setString(4, theBooks.getGenres());
//		myStmt.setString(5, theBooks.getCharacters());
//		myStmt.setString(6, theBooks.getGenres());
//		
//		//execute SQL insert
//		myStmt.execute();
//	}catch (Exception e) {
//		e.printStackTrace();
//	}
//	finally {
//		close(myConn, myStmt, null);
//	}
//
//	
//}

}
