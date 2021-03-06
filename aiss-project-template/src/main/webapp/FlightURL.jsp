<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/header.css">
<link rel="stylesheet" type="text/css" href="/css/flightURL.css">
<script type="text/javascript" src="/js/SelectURL.js" defer></script>
<meta charset="ISO-8859-1">
      <% String printDepTitle = (String) request.getAttribute("departureAirportTitle"); %>
      <% String printDestTitle = (String) request.getAttribute("destinationAirportTitle"); %>
      <title>Vuelos desde <%= printDepTitle %> a <%= printDestTitle %></title>
</head>

<body><a href="index.html"><img class="logo" src="/images/globo.png" alt="Trip Finder Logo"></a>
<div class="center">
<h1>�Su vuelo est� listo!</h1>

<form action="FlightPollController" method="get">
	<select name="urlSelect" id="urlSelect">
	<c:set var="count" value="0" scope="page"/>  
	<c:forEach items="${requestScope.partnersURL}" var="url">
		<c:set var="count" value="${count + 1}" scope="page"/>
		<option value="<c:out value="${url}"/>">Opci�n de Vuelo <c:out value="${count}"/></option>
	</c:forEach>
	</select><br><br>
	<input type="button"  class="button" value="Acceder" onclick="goToNewPage()">
	</form>
</div>

</body>
</html>