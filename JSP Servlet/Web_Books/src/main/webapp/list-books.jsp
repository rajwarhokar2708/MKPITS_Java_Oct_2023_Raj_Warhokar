<%@page import="com.mkpits.jdbc.Books_Model"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books List</title>
<link type="text/css" rel="stylesheet" href="Css/style_books.css">
<script>

function showmore(id){
	/* var read = document.getElementByClassName("read"); */
	var button = document.querySelector('button[onclick ="showmore(\''+id+'\')"]');
	var element = document.getElementById(id);
	
	
	if(element.style.display === '-webkit-box'){
		element.style.display ='block';
		button.textContent = 'Show Less';
	}else{
		element.style.display ='-webkit-box';
		button.textContent = 'Show More';
	}
}
</script>


<script>
function search(){
	
	let filter = document.getElementById("myInput").value.toUpperCase();
    let myTable = document.getElementById("myTable");
    let tr = myTable.getElementsByTagName("tr");

    for(var i = 0; i < tr.length; i++){
        let td = tr[i].querySelector(".td");

        if(td){
            let textvalue = td.textContent || td.innerHTML;

            if(textvalue.toUpperCase().indexOf(filter) > -1){
                tr[i].style.display = "";
               
            } else {
               tr[i].style.display = "none";
   
            }
        }
    }
}

</script>

</head>
<%
//get the student the requestDispatcher
List<Books_Model> theBooks = (List<Books_Model>) request.getAttribute("BOOKS_LIST");
%>
<body>
 <div id="wrapper">
  <div id="header">
  <h2> BOOKS LIST</h2>
  </div>
  </div>
 <br>
 <div class="outer">
 <div class="search"><input type="text" id="myInput" placeholder="Search Books Title.." onkeyup = "search()"/></div>
 <div class="pagination-header">
			<div class="pagination-button">
			<c:url var="Link1" value="BooksControllerServlet?page=1">
						<c:param name="command" value="RECORDS" />
					</c:url>
					<c:url var="Link2" value="BooksControllerServlet?page=2">
						<c:param name="command" value="RECORDS" />
					</c:url>
					<c:url var="Link3" value="BooksControllerServlet?page=3">
						<c:param name="command" value="RECORDS" />
					</c:url>
					<c:url var="Link4" value="BooksControllerServlet?page=4">
						<c:param name="command" value="RECORDS" />
					</c:url>
					<c:url var="Link5" value="BooksControllerServlet?page=5">
						<c:param name="command" value="RECORDS" />
					</c:url>
              <a href="${Link1}">1</a> 
              <a href="${Link2}">2</a>
               <a href="${Link3}">3</a>
                <a href="${Link4}">4</a>
                <a href="${Link5}">5</a>
              
			</div>
			</div>
 <input type="button" value="Add Books" onclick="window.location.href ='add_books_form.jsp; return false'"
   class="add_books_button">
   </br>
   </div>
   
 <div id="container">
 <div id="content">
 
 <table border="1" id ="myTable">
 <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author</th>
        <th>Date</th>
        <th>Genres</th>
        <th>Characters</th>
        <th>Synopsis</th>
        <th>Action</th>
    </tr>
    <c:forEach var ="tempBook" items ="${BOOKS_LIST}">
    <!--  Set up link for each student -->
    <c:url var="tempLink"  value="BooksControllerServlet">
    <c:param  name="command" value="LOAD" /> 
    <c:param  name="booksId" value="${tempBook.id}" /> 
    </c:url>
    
    <!--  Set up link for each student -->
    <c:url var="deleteLink"  value="BooksControllerServlet">
    <c:param  name="command" value="DELETE" /> 
    <c:param  name="booksId" value="${tempBook.id}" /> 
    </c:url>
    
    
    
    
    <tr>
            <td>${tempBook.id} </td>         
           <td class="td">${tempBook.title} </td>
           <td>${tempBook.author}</td>
           <td>${tempBook.date} </td>
                      
           <td><p id="genres_${tempBook.id}">${tempBook.genres}</p>
           <button  class ="read" type="button" onclick="showmore('genres_${tempBook.id}')">Show More</button> </td>
                      
           <td><p id="characters_${tempBook.id}">${tempBook.characters}</p>
           <button  class="read" type="button" onclick="showmore('characters_${tempBook.id}')">Show More</button> </td>
                      
           <td><p id="synopsis_${tempBook.id}">${tempBook.synopsis} </p>
           <button  class="read" type="button" onclick="showmore('synopsis_${tempBook.id}')">Show More</button></td>
                      
           <td>
           <a class ="updel" id="up" href="${tempLink}">Update</a>
           <a class ="updel" id="del" href="${deleteLink}" onclick="if(!(confirm('Are yousure you want to destroy this row ?'))) return false">Delete</a>
           </td>
           
                   
    </tr>
    </c:forEach>
    
 </table>
 </div>
 </div>
</body>
</html>