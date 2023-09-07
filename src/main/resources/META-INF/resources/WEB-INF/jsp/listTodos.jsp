<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--      /META-INF/resources/webjars/jquery/3.6.0/jquery.min.js
     /META-INF/resources/webjars/bootstrap/5.1.3/css/bootstrap.min.css
     /META-INF/resources/webjars/bootstrap/5.1.3/js/bootstrap.bundle.min.js
-->
<!DOCTYPE html>

<html>
 
<head>
    <!-- Information about the page -->
    <!--This is the comment tag-->
     
    <title>Todo page</title>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet"></link>
</head>
 
<body>
<div class="container">
    <div>Welcome to the Dashboard ${name }</div>
    <hr/>
    <div><h1>Your Todos</h1></div>
    <table class="table">
		<thead>
		<tr>
			
			<th>Description</th>
			<th>Target Date</th>
			<th>Is Done?</th>
		</tr>
		</thead>
		<tbody>
		    <c:forEach items="${todos }" var = "todo">
		    	<tr>
		    		
		    		<td>${todo.description }</td>
		    		<td>${todo.targetDate }</td>
		    		<td>${todo.done }</td>
		    		<td><a href="update-todo?id=${todo.id }" class="btn btn-success">Update</a></td>
		    		<td><a href="delete-todo?id=${todo.id }" class="btn btn-warning">Delete</a></td>
		    	</tr>
		    </c:forEach>
		</tbody>    
    </table>
    <a href="add-todo" class="btn btn-success">Add Todo</a>
    </div>
    
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
    <script src="wwebjars/jquery/3.6.0/jquery.min.js"></script>
</body>
 
</html>