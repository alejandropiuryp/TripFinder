<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Business</title>
<link rel="stylesheet" type="text/css" href="/css/header.css">
<link rel="stylesheet" type="text/css" href="/css/businessSearch.css">
</head>
<body><a href="index.html"><img class="logo" src="/images/globo.png" alt="Trip Finder Logo"></a>
<div class="container">
<div class="search-box">
	<form action="YelpController" method="post">
	<input type = "text" name = "searchQuery" class="search-box" placeholder="Introduce una ciudad" pattern="^[a-zA-Z][a-zA-Z\s]*$" title="Introduzca una ciudad sin caracteres especiales" required>
	<button class="button" type="submit">Buscar</button>
	</form>
</div>
<div class="search-results">	
	<c:forEach items = "${requestScope.listaNegocios}" var="business">
		<div id="negocio">
			<h3><c:out value="${business.name}"/><br></h3>
		</div>
			
				Ratings: <c:out value="${business.rating}"/><br>
				Direccion: <c:out value="${business.location.address1} "/><br>
				Telefono: <c:out value="${business.phone} "/><br>
				Categoria: <c:out value="${business.categories[0].title} "/><br>
				<c:set var="estado" scope="page" value="${business.isClosed}"></c:set>
       				 <c:if test = "${estado == false}">
             			 Estado: cerrado 
             			
        			</c:if>
       				 <c:if test = "${estado == true}">
             			 Estado: abierto 
             			
        			</c:if>
        
		<div id="foto"><br>
			<img src = "<c:out value="${business.imageUrl}"/>" width="300" >
		</div>
	</c:forEach>
</div>
</div>

</body>
</html>