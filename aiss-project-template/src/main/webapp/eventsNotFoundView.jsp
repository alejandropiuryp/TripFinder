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

<h1 class="error">Eventos no encontrados</h1>

</body>
</html>