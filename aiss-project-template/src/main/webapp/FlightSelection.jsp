<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/header.css">
<link rel="stylesheet" type="text/css" href="/css/flightSelection.css">
<meta charset="ISO-8859-1">
      <% String printDepTitle = (String) request.getAttribute("departureQueryTitle"); %>
      <% String printDestTitle = (String) request.getAttribute("destinationQueryTitle"); %>
  
      
<title>Buscando vuelos de <%= printDepTitle %> a  <%= printDestTitle %></title>

<script></script>
</head>
<body><a href="index.html"><img class="logo" src="/images/globo.png" alt="Trip Finder Logo"></a>
<div class="background">
<div class="search-wrapper">
	<h1>¡Ya casi!</h1>
	<form action="CreateFSessionController" method="post">
		<select name="departureSelectedValue" class="select" id="depSelect" required>
		<c:forEach items="${requestScope.airportSelectDep}" var="depAirport">
			<option value="<c:out value="${depAirport}"/>"><c:out value="${depAirport}"/></option>
		</c:forEach>
	</select>
	
	<select name="destinationSelectedValue"  class="select" id="destSelect"required>
		<c:forEach items="${requestScope.airportSelectDest}" var="destAirport">
			<option value="<c:out value="${destAirport}"/>"><c:out value="${destAirport}"/></option>
		</c:forEach>
	</select><br>
	
	<input placeholder="Salida" class="date-picker" type="text" onfocus="(this.type='date')" onblur="(this.type='text')" name="departureDate" required/>
	<input placeholder="Vuelta" class="date-picker" type="text" onfocus="(this.type='date')" onblur="(this.type='text')" name="returnDate" /><input placeholder="Nº Mayores" type="text" class="input-field" onfocus="(this.type='number')" onblur="(this.type='text')" name="seniors" min="0" max="6" step="1" required><input placeholder="Nº Adultos" type="text" onfocus="(this.type='number')" onblur="(this.type='text')" class="input-field" name="adults" min="1" max="6" step="1" required><br>


	<input placeholder="Edad Niños" type="text" class="input-field" name="childrenAge" id="childrenAge" pattern="(\b([0-9]|1[0-7])\b[\,]{0,1}){0,5}" title="El formato es: 0,17, ..." required>
	<select name="travelerClass" class="select" id="travelerClass" required>
			<option value="0">Turista</option>
			<option value="1">Preferente</option>
			<option value="2">Primera</option>
			<option value="3">Económica superior</option>
			
	</select><br>


	<button type="submit" class="button" value="submit">Buscar vuelos</button><br>
	
	</form>
	</div>
</div>
</body>
</html>