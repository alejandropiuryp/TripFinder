<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
      <% String printDepTitle = (String) request.getAttribute("departureAirportTitle"); %>
      <% String printDestTitle = (String) request.getAttribute("destinationAirportTitle"); %>
      <title>Vuelos desde <%= printDepTitle %> a <%= printDestTitle %></title>
</head>

<body>
<div align="center">
<form action="FlightPollController" method="get">
	<select name="urlSelect" id="urlSelect">
	<c:set var="count" value="0" scope="page"/>  
	<c:forEach items="${requestScope.partnersURL}" var="url">
		<c:set var="count" value="${count + 1}" scope="page"/>
		<option value="<c:out value="${url}"/>">Opción de Vuelo <c:out value="${count}"/></option>
	</c:forEach>
	</select>
	<input type="button"  value="Acceder" onclick="goToNewPage()">
	</form>
	<script type="text/javascript">
	function goToNewPage() {
        if(document.getElementById('urlSelect').value){
            window.location.href = document.getElementById('urlSelect').value;
        }
    }
</script>
</div>

</body>
</html>