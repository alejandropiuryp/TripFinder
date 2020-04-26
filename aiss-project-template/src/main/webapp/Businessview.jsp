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
	<c:forEach items = "${requestScope.listaNegocios}" var="business">
		<li>
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
		</li>
	</c:forEach>
</div>

</body>
</html>