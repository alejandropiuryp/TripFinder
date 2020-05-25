<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Busqueda de negocios</title>
<link rel="stylesheet" type="text/css" href="/css/header.css">
<link rel="stylesheet" type="text/css" href="/css/businessSearch.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script type="text/javascript" src="/js/SliderNegocios.js" defer></script>
</head>
<body><a href="index.html"><img class="logo" src="/images/globo.png" alt="Trip Finder Logo"></a>
<div class="Encabezado">
<h1><strong>Busque el negocio deseado</strong></h1>
</div>
<div class="buscador">
	<form action="YelpController" method="post">
	<input type = "text" name = "searchQuery" class="search-box" placeholder="Introduce una ciudad" pattern="^[a-zA-Z][a-zA-Z\s]*$" title="Introduzca una ciudad sin caracteres especiales" required>
	<button class="button" type="reset">Borrar</button>
	</form>
</div>
<div class="w3-content w3-display-container">	
	<c:forEach items = "${requestScope.listaNegocios}" var="business">
		<div class="Slide">
			<h3><c:out value="${business.name}"/><br></h3>
	
	
				<h6>Ratings: <c:out value="${business.rating}"/><br>
				Direccion: <c:out value="${business.location.address1} "/><br>
				Telefono: <c:out value="${business.phone} "/><br>
				Categoria: <c:out value="${business.categories[0].title} "/><br>
				<c:set var="estado" scope="page" value="${business.isClosed}"></c:set>
       				 <c:if test = "${estado == false}">
             			 Estado: cerrado 
             			
        			</c:if>
       				 <c:if test = "${estado == true}">
             			 Estado: abierto 
             			
        			</c:if></h6>
        	
		
			<img src = "<c:out value="${business.imageUrl}"/>" >
		</div>
	</c:forEach>
	<button class="w3-button w3-black w3-display-left w3-display-hover" onclick="plusDivs(-1)">&#10094;</button>
    <button class="w3-button w3-black w3-display-right w3-display-hover" onclick="plusDivs(1)">&#10095;</button>
</div>
</body>
</html>