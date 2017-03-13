<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Insert title here</title>
</head>
<body>
<c:catch>  
int a=10/0;  
</c:catch>
 
 
 <c:set var="a" value="active" />
 
  <c:set var="a" value="info" />
   <c:set var="a" value="danger" />
  

  <h2>TABLA </h2>
  <p>Tabla hecha con bootstrap. The classes that can be used are: .active, .success, .info, .warning, and .danger.</p>

<div style="height:430px;overflow-y:scroll;;">
		<table class="table">
			<thead>
				<tr>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Edad</th>
					<th>Telefono</th>
					<th>Ciudad</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${userList}" var="persona">
				  	
					<tr class="success">
						<td>${persona.nombre}</td>
						<td>${persona.apellido}</td>
						<td>${persona.edad}</td>
						<td>${persona.telefono}</td>
						<td>${persona.ciudad}</td>
					</tr>
					
					
				</c:forEach>
			</tbody>


		</table>


	</div>

 




</body>
</html>