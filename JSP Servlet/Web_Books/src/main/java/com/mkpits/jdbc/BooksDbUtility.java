package com.mkpits.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class BooksDbUtility {

  private static DataSource dataSource;
  
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
			  Books_Model tempBooks = new Books_Model(id, title, author, date, genres, characters, synopsis);
			  
			  //add it to the list of the student
			  books.add(tempBooks);
		  }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  } finally {
		  close(myConn, myStmt, myRs);
		  
	  }
	  return books;
	  
  }

private static void close(Connection myConn, Statement myStmt, ResultSet myRs) {
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

public void addBooks(Books_Model theBooks) {
	Connection myConn = null;
	PreparedStatement myStmt = null;
	
	try {
		//get db connection
		myConn = dataSource.getConnection();
		
		//create sql for insert
		String sql = "insert into books(title ,author ,date ,genres ,characters ,synopsis ) values(?,?,?,?,?,?)";
		myStmt = myConn.prepareStatement(sql);
		
		//set the param values for the student
		myStmt.setString(1, theBooks.getTitle());
		myStmt.setString(2, theBooks.getAuthor());
		myStmt.setString(3, theBooks.getDate());
		myStmt.setString(4, theBooks.getGenres());
		myStmt.setString(5, theBooks.getCharacters());
		myStmt.setString(6, theBooks.getGenres());
		
		//execute SQL insert
		myStmt.execute();
	}catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		close(myConn, myStmt, null);
	}

	
}

public Books_Model loadbooks(String theBooksId) 
{
	Books_Model theBooks = null;
	Connection myConn = null;
	PreparedStatement myStmt = null;
	ResultSet myRs = null;
	int booksId;

	try {
		// convert student id into integer
		booksId = Integer.parseInt(theBooksId);

		// get database connection
		myConn = dataSource.getConnection();

		// create sql to get selected student
		String sql = "select * from books where id = ?";

		// create a prepared statement
		myStmt = myConn.prepareStatement(sql);

		// set params
		myStmt.setInt(1, booksId);

		// execute statement
		myRs = myStmt.executeQuery();

		// retrive data from result set row
		if (myRs.next()) {
			String title = myRs.getString("title");
			String author = myRs.getString("author");
			String date = myRs.getString("date");
			String genres = myRs.getString("genres");
			String characters = myRs.getString("characters");
			String synopsis = myRs.getString("synopsis");

			// use the studentid during constrction
			theBooks = new Books_Model(booksId, title, author, date, genres, characters, synopsis);
		} else {
			throw new Exception("Could not find bookid " + theBooks);
		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		close(myConn, myStmt, myRs);
	}

	return theBooks;
}

public void updateBooks(Books_Model theBooks) throws Exception {
	Connection myConn = null;
	PreparedStatement myStmt = null;
	try {

		// get db connection

		myConn = dataSource.getConnection();

		// create sql to get update student
		String sql = "update books set title = ?,author = ?,date = ?,genres = ?,characters = ?,synopsis = ? where id = ?";

		// create a prepared statement
		myStmt = myConn.prepareStatement(sql);

		// set params
		myStmt.setString(1, theBooks.getTitle());
		myStmt.setString(2, theBooks.getAuthor());
		myStmt.setString(3, theBooks.getDate());
		myStmt.setString(4, theBooks.getGenres());
		myStmt.setString(5, theBooks.getCharacters());
		myStmt.setString(6, theBooks.getSynopsis());
		myStmt.setInt(7, theBooks.getId());

		// execute SQL statement
		myStmt.execute();

	} finally {
		close(myConn, myStmt, null);
	}

	
}

public void deleteStudent(String booksId) throws Exception {
	Connection myConn = null;
	PreparedStatement myStmt = null;
	try {
		// convert student to integer
		int theBooksId = Integer.parseInt(booksId);

		// get db connection

		myConn = dataSource.getConnection();

		// create sql to get update student
		String sql = "delete from books where id = ?";

		// create a prepared statement
		myStmt = myConn.prepareStatement(sql);
		
		//set params
		myStmt.setInt(1, theBooksId);
		
		//execute sql
		myStmt.execute();
	} finally {
		close(myConn, myStmt, null);
	}
	
}

public static  List<Books_Model> getBooks(int start, int total)throws Exception {
	 List<Books_Model> books = new ArrayList<>();
	 
	  Connection myConn = null;
	  Statement myStmt = null;
	  ResultSet myRs = null;
	  try {
		  
		  myConn = dataSource.getConnection();
		  
		  //create a sql statement
		  String sql = "Select * from books  limit "+(start-1)+","+total;
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
			  
			 

			  
			  //create new student object
			  Books_Model tempBooks = new Books_Model(id, title, author, date, genres, characters, synopsis);
			  
			  //add it to the list of the student
			  books.add(tempBooks);
		  }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  } finally {
		  close(myConn, myStmt, myRs);
		  
	  }
	  return books;
	  
}


}
