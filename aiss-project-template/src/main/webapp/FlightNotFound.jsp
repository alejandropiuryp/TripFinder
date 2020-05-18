<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <% String printDepTitle = (String) request.getAttribute("departureQueryTitle"); %>
      <% String printDestTitle = (String) request.getAttribute("destinationQueryTitle"); %>
<title>Resultados no encontrados</title>
<link rel="stylesheet" type="text/css" href="/css/header.css">
<link rel="stylesheet" type="text/css" href="/css/flightError.css">
</head>
<body>
<img src="/images/sad-plane.png" class="image" ></img>
<div class="center"><h1>¡Ups!</h1>
<p>Lo sentimos, no se han encontrado resultados para la búsqueda de vuelos de <%= printDepTitle %> a  <%= printDestTitle %>.</p>
<a href="vuelo.html" class="button">Volver al inicio</a>
</div>
</body>
</html>