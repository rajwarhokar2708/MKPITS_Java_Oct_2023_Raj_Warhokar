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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	private BooksDbUtility booksDbUtil;
	@Resource(name = "jdbc/mkpits")
	private DataSource dataSource;

	public void init() throws ServletException {
		super.init();
		// create student db util ..and pass int the conn pool / dataSource
		try {
			booksDbUtil = new BooksDbUtility(dataSource);
		} catch (Exception exe) {
			throw new ServletException(exe);
		}
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			// read the "command" parameter
			String theCommand = request.getParameter("command");

			System.out.println(theCommand);
			// if the command is missing, then default to listing student

			if (theCommand == null) {
				theCommand = "LIST";
			}

			// route to the appropriate method
			switch (theCommand) {
			case "LIST":
				listBooks(request, response);
				break;
			case "ADD":
				addBooks(request, response);
				break;
			case "LOAD":
				loadBooks(request, response);
				break;
			case "UPDATE":
				updateBooks(request, response);
				break;
			case "DELETE":
				deleteBooks(request, response);
				break;
			case "RECORDS":
				listRecords(request,response);
				break;
			default:
				listBooks(request, response);
			}

		} catch (Exception e) {
			throw new ServletException(e);		}
	}

	private void listRecords(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String spageid = request.getParameter("page");
		int pageid = Integer.parseInt(spageid);
		int total = 300;
		if (pageid == 1) {
		} else {
			pageid = pageid - 1;
			pageid = pageid * total + 1;
		}
		List<Books_Model> books = BooksDbUtility.getBooks(pageid, total);
		// add student to the request
		request.setAttribute("BOOKS_LIST", books);
		// send to JSP page view
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-books.jsp");
		dispatcher.forward(request, response);
		
	}

	private void deleteBooks(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// read student id from form data
		String booksId = request.getParameter("booksId");

		// delete student from database
		booksDbUtil.deleteStudent(booksId);

		// send back to again "list-student.jsp"
		listBooks(request, response);

	}

	private void updateBooks(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// read student id from form data
		String booksId = request.getParameter("booksId");
		int id = Integer.parseInt(booksId);

		// read student data from form
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String date = request.getParameter("date");
		String genres = request.getParameter("genres");
		String characters = request.getParameter("characters");
		String synopsis = request.getParameter("synopsis");

		// create a new student object
		Books_Model theBooks = new Books_Model(id, title, author, date, genres, characters, synopsis);

		// perform update on deatabase
		booksDbUtil.updateBooks(theBooks);

		// send them back to the list "list-students" page
		listBooks(request, response);

	}

	private void loadBooks(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// read student id from form data
		String theBooksId = request.getParameter("booksId");

		// get student from database (dbutility)
		Books_Model theBooks = booksDbUtil.loadbooks(theBooksId);

		// place student in the request attribute
		request.setAttribute("BOOKS_LIST", theBooks);

		// send to JSP page view
		RequestDispatcher dispatcher = request.getRequestDispatcher("/update_books_forms.jsp");
		dispatcher.forward(request, response);
	}

	private void addBooks(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// read student data from form
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String date = request.getParameter("date");
		String genres = request.getParameter("genres");
		String characters = request.getParameter("characters");
		String synopsis = request.getParameter("synopsis");

		// create new Student_Model object
		Books_Model theBooks = new Books_Model(title, author, date, genres, characters, synopsis);

		//// add student to the database
		booksDbUtil.addBooks(theBooks);

		// send back to main page (the student list)
		listBooks(request, response);

	}

	private void listBooks(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// get students from db util
		List<Books_Model> books = booksDbUtil.getBooks();

		// add students to the request
		request.setAttribute("BOOKS_LIST", books);

		// send to JSP page(view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-books.jsp");
		dispatcher.forward(request, response);

	}

}
