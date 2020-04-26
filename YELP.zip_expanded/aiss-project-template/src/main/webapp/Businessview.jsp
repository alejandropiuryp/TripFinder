<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Business</title>
</head>
<body>
<div>
	<form action="YelpController" method="post">
	<input type = "text" name = "searchQuery" required class="search-box" placeholder="Buscar business"/>
	<button class="button" type="reset"></button>
	</form>
</div>
<div>	
	<c:forEach items = "${requestScope.business}" var="business_">
		<li>
		<div id="negocio">
			<h1><c:out value="${business_.name}"/><br></h1>
		</div>
			<p>
				Ratings: <c:out value="${business_.rating}"/><br>
				Direccion: <c:out value="${business_.location.address1} "/><br>
				Precio: <c:out value="${business_.price}"/><br>
				Categoria: <c:out value="${business_.category[1].title}"/><br>
				Teléfono: <c:out value="${business_.phone} "/><br>
				Estado: <c:out value ="${business_.is_closed}"/>
			</p>
		<div id="foto">
			<img src = '<c:out value="${business_.image_url}"/>' width="300" >
		</div>
		</li>
	</c:forEach>
</div>

</body>
</html>