<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Events</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script type="text/javascript" src="/js/Slider.js"></script>

</head>
<body>

<div class="search-wrapper">
	<form action="TicketMasterController" method="post">
	<input type="text" name="searchQuery" required class="search-box" placeholder="Bucar eventos en la ciudad..." />
	<button class="close-icon" type="reset"></button>
	</form>
</div>
<div id="slider">
  	<a href="#" class="control_next">></a>
  	<a href="#" class="control_prev"><</a>
  	<ul>
  		<c:forEach items="${requestScope.events}" var="event">
  			<li>
  			<div id="evento">
  				<h1><c:out value="${event.name}"/> <br></h1>	
  			</div>
  			<div id="foto">
  				<img src='<c:out value="${event.images[0].url}"/>' height="300" width="500"> <br>
  			</div>
  			<p>
  				Fecha: <c:out value="${event.dates.start.localDate}"/><br>
  				Hora:  <c:out value="${event.dates.start.localTime}"/><br>
  				Dirección: <c:out value="${event.embedded.venues[0].address.line1}"/>
  			</p>
  			<a href=<c:out value="${event.url}"/> class="button button1">Comprar entrada</a>
  			<a href="/googleCalendarList?id=<c:out value="${event.id}"/>" class="button2 button1">Llevar a tu calendario</a>
  		 	</li>
  		</c:forEach>
 	 </ul>  
</div>
<div class="slider_option">
 	<input type="checkbox" id="checkbox" class ="mute-button MuteOff" >
 	<label for="checkbox">Autoplay Slider</label>
</div> 
</body>
</html>