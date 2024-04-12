package com.mkpits.jdbc;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/BooksControllerServlet")
public class BooksControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BooksControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    private BooksDbUtility booksDbUtil;
    @Resource(name = "jdbc/mkpits")
    private DataSource dataSource;
   
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
//create our student db util... and pass in the conn pool/datasource
    	
    	try {
    		booksDbUtil = new BooksDbUtility(dataSource);
    	}
    	catch (Exception exc) {
        throw  new ServletException(exc);
        }
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		   try {
			   //read the "command" parameter
			   String theCommand = request.getParameter("command");
			   
			   //if the command is missing , then default to listing student
			   
//			   if(theCommand == null){
//				   theCommand="LIST";
//			   }
//			 //route to the appropriate method
//				switch (theCommand) {
//				case "LIST" : 
//					listBooks(request,response);
//					break;
//				case "ADD" :
//					addBooks(request,response);
//					break;
//				default:
//					listBooks(request,response);
//				}
			   
			   
			   
				listBooks(request, response);
		} catch (Exception e) {
			throw new ServletException();
		}
		}
	
		
//	private void addBooks(HttpServletRequest request, HttpServletResponse response) throws Exception {
//
//		//read student data from form
//				String title = request.getParameter("title");
//				String author = request.getParameter("author");
//				String date = request.getParameter("date");
//				String genres = request.getParameter("genres");
//				String characters = request.getParameter("characters");
//				String synopsis = request.getParameter("synopsis");
//				
//				
//				// create new Student_Model object
//				Books_Model theBooks = new Books_Model(title, author, date, genres, characters, synopsis);
//				
//				////add student to the database
//				booksDbUtil.addBooks(theBooks);
//				
//				//send back to main page (the student list) 
//				listBooks(request, response);
//
//
//}
	
	
	private void listBooks(HttpServletRequest request, HttpServletResponse response) throws Exception {
     // get students from db util
		List<Books_Model> books = booksDbUtil.getBooks();
		
		//add students to the request
		request.setAttribute("BOOKS_LIST", books);
		
		//send to JSP page(view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-books.jsp");
		dispatcher.forward(request, response);
		
	}

}
