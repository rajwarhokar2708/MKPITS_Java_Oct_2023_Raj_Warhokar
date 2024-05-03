package com.mkpits.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;



/**
 * Servlet implementation class ControllerServelet
 */
@WebServlet("/ControllerServelet")
public class ControllerServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	private DbUtility dbUtility;
	@Resource(name = "jdbc/registration_data")
	private DataSource dataSource;
	
	public void init() throws ServletException {
		super.init();
		try {
			dbUtility = new DbUtility(dataSource);
		} catch (Exception exe) {
			throw new ServletException(exe);
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
				addCustomer(request,response);
		

		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//for login
		
				try {
					PrintWriter out=response.getWriter();
					response.setContentType("text/html");
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/registration_data","root","");
					String n=request.getParameter("email").trim();
					String p=request.getParameter("password");
					PreparedStatement ps=conn.prepareStatement("select email from customer_data where email=? and password=?");
					ps.setString(1, n);
					ps.setString(2, p);
					ResultSet rs= ps.executeQuery();
					if(rs.next()) {
						
						RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
						rd.forward(request, response);
					}else {
						RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
						rd.forward(request, response);
						out.println("login failed");
					}
				} catch (ClassNotFoundException e) {
				
					e.printStackTrace();
				} catch (SQLException e) {
					
					e.printStackTrace();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
	

//	private void loginCredential(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String inputEmail=request.getParameter("email");
//		System.out.println(inputEmail);
//		String inputPassword=request.getParameter("password");
////		List<Customer_Model> customer=dbUtility.getDetails(inputEmail,inputPassword);
//		
//		String customer1=dbUtility.getDetails(inputEmail, inputPassword);
//		
////		request.setAttribute("LOGIN_DETAILS", customer1);
//		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/successfull.jsp");
//		dispatcher.forward(request, response);
//		
//	}

	private void addCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// read student data from form
				String name = request.getParameter("name");
				String email = request.getParameter("email");
				String gender = request.getParameter("gender");
				String city = request.getParameter("city");
				String mobile_no = request.getParameter("mobile_no");
				String password = request.getParameter("password");
				

				// create new Student_Model object
				Customer_Model theCustomer = new Customer_Model(name, email, gender, city, mobile_no, password);

				// add student to the database
				DbUtility.addCustomer(theCustomer);

				// send to JSP page view
				RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
				dispatcher.forward(request, response);	
	}
	
}

